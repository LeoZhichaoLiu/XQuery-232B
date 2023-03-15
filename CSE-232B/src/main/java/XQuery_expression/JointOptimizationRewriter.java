package XQuery_expression;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import xQuery_parsers.XQueryLexer;
import xQuery_parsers.XQueryParser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JointOptimizationRewriter {

    public Map<String,String> for2xqMap=new HashMap<>();
    public Map<Integer,String> orderMap=new HashMap<>();
    private List<Pair<String,String>> condPairs=new ArrayList<>();

    private static StringBuilder rewritersPairing(XQueryParser.FunctionXqContext fxc, List<Map<String, String>> for2xqList, List<Map<Integer, String>> orderList) {
        List<List<Pair<String, String>>> whereList = new ArrayList<>();

        for(Map<String, String> ignored : for2xqList) {
            whereList.add(new ArrayList<>());
        }

//        System.out.println(fxc.whereClause().cond().getText());
        String[] multipleWheres = fxc.whereClause().cond().getText().split("and");
//        System.out.println(multipleWheres);

        for(String where:multipleWheres){
//            System.out.println(where);
            String[] xqList=where.split("eq|=");
            String left=xqList[0].trim();
            String right=xqList[1].trim();
//            System.out.println(left);
//            System.out.println(right);
            for (int i = 0; i < for2xqList.size(); i++) {
                if (for2xqList.get(i).containsKey(left) || for2xqList.get(i).containsKey(right)) {
                    whereList.get(i).add(new Pair<>(left, right));
                }
            }
        }

        List<StringBuilder> rewriters=new ArrayList<>();

        for(int i=0;i< for2xqList.size();i++){
            JointOptimizationRewriter r= new JointOptimizationRewriter();

            r.for2xqMap.clear();
            r.for2xqMap.putAll(for2xqList.get(i));
            r.orderMap.putAll(orderList.get(i));

            r.condPairs.clear();
            r.condPairs.addAll(whereList.get(i));

            StringBuilder builder4r=new StringBuilder("for ");
            for(int ir=0; ir<r.orderMap.size(); ir++) {
                builder4r.append(r.orderMap.get(ir));
                builder4r.append(" ");
                builder4r.append("in");
                builder4r.append(" ");
                builder4r.append(r.for2xqMap.get(r.orderMap.get(ir)));
                builder4r.append(",\n");
            }
            builder4r.deleteCharAt(builder4r.length()-2);

            StringBuilder whereBuilder=new StringBuilder("where ");


            for(Pair<String,String> pair:r.condPairs){
                String leftRoot=pair.a.split("/")[0];
                String rightRoot=pair.b.split("/")[0];
                if((r.for2xqMap.containsKey(leftRoot) && r.for2xqMap.containsKey(rightRoot)) ||
                        (r.for2xqMap.containsKey(leftRoot) && !rightRoot.startsWith("$")) ||
                        (r.for2xqMap.containsKey(rightRoot) && !leftRoot.startsWith("$"))) {
                    whereBuilder.append(pair.a);
                    whereBuilder.append(" eq ");
                    whereBuilder.append(pair.b);
                    whereBuilder.append(",\n");
                }
            }

            if(whereBuilder.toString()=="where ") {
                whereBuilder.deleteCharAt(whereBuilder.length() - 2);  // remove last comma
                builder4r.append(whereBuilder);
            }

            builder4r.append("return <tuple>{\n");
            for(int ir=0; ir<r.orderMap.size(); ir++) {
                String var = r.orderMap.get(ir);
                String rawName = var.substring(1);
                builder4r.append("<").append(rawName).append(">{");
                builder4r.append(var);
                builder4r.append("}<").append("/").append(rawName).append(">");
                builder4r.append(",\n");
            }
            builder4r.deleteCharAt(builder4r.length()-2);  // remove last comma
            builder4r.append("}</tuple>,\n");
            rewriters.add(builder4r);
        }

        // We store the result to this arrayList and output as a string format
//        ArrayList builder = new ArrayList();
        StringBuilder builder = new StringBuilder();
        builder.append(rewriters.get(0));
//        System.out.println(builder);

        Map<Integer, Boolean> visited = new HashMap<>();
        visited.put(0,true);
        Set<String> set = new HashSet<>(for2xqList.get(0).keySet());

        for (int i = 1; i < for2xqList.size(); i++) {
            visited.put(i, false);
        }

        while (visited.values().contains(false)) {

            int num=(int) visited.values().stream().filter(x->x==false).count();

            for (int i = 1; i < for2xqList.size(); i++) {
                if (visited.get(i)) {
                    continue;
                }

                List<String> condLeft = new ArrayList<>();
                List<String> condRight = new ArrayList<>();
                for (Pair<String, String> p : whereList.get(i)) {
                    if (set.contains(p.a) && for2xqList.get(i).containsKey(p.b)) {
                        condLeft.add(p.a);
                        condRight.add(p.b);
                    } else if (set.contains(p.b) && for2xqList.get(i).containsKey(p.a)) {
                        condLeft.add(p.b);
                        condRight.add(p.a);
                    }
                }
//                System.out.println(builder);
                if (!condLeft.isEmpty()) {
                    visited.put(i, true);
                    set.addAll(for2xqList.get(i).keySet());
                    builder.insert(0, "join (");
                    builder.append(rewriters.get(i).toString());
                    builder.append("[");
                    for (String left : condLeft) {
                        //to remove $, make sure whether it should be changed
                        builder.append(left.substring(1));
                        builder.append(",");
                    }
                    builder.delete(builder.length() - 1,builder.length());
                    builder.append("], ");
                    builder.append("[");

                    for (String right : condRight) {
                        //And this one
                        builder.append(right.substring(1));
                        builder.append(",");
                    }

                    builder.delete(builder.length() - 1,builder.length());
                    builder.append("], ");
                    builder.append("\n");
                    builder.append("),\n");
                }
            }

            if (num == (int) visited.values().stream().filter(x->x==false).count()){
                int index=-1;
                for(int ii=0;ii<for2xqList.size();ii++){
                    if(!visited.get(ii)){
                        index=ii;
                        break;
                    }
                }

                if(index==-1){
                    continue;
                }

                visited.put(index,true);
                set.addAll(for2xqList.get(index).keySet());

                builder.insert(0,"join (");
                builder.append(for2xqList.get(index));
                builder.append("[], []\n),\n");
            }
        }

        builder.delete(builder.length()-2,builder.length());
        builder.insert(0,"for $tuple in ");

        return builder;
    }

    private static XQueryParser.FunctionXqContext originalBuilder(String originalQueries){

//        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(originalQueries));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);

        return (XQueryParser.FunctionXqContext) parser.xq();
    }

    public static String rewriter(String originalQueries) {

//        JointOptimizationRewriter jointOpt=new JointOptimizationRewriter();
        XQueryParser.FunctionXqContext fxc=originalBuilder(originalQueries);
        List<Map<String, String>> for2xqList = new ArrayList<>();
        List<Map<Integer, String>> orderList = new ArrayList<>();

//        System.out.println(fxc.forClause().xq().size());

        for(int i=0;i<fxc.forClause().Var().size();i++){

//            System.out.println(i);
//            System.out.println(fxc.forClause().Var(i).getText());

            String var= fxc.forClause().Var(i).getText();
            String xq=fxc.forClause().xq(i).getText();
            String root=xq.split("/")[0];

            boolean flag=false;

            for(int j=0;j<for2xqList.size();j++){
                if(for2xqList.get(j).containsKey(root)){
                    flag=true;
                    for2xqList.get(j).put(var,xq);
                    orderList.get(j).put(orderList.get(j).size(),var);
                    break;
                }
            }

            if(!flag){
                Map<String, String> hash = new HashMap<>();
                hash.put(var, xq);
                for2xqList.add(hash);
                Map<Integer, String> orderMap = new HashMap<>();
                orderMap.put(0, var);
                orderList.add(orderMap);
            }
        }

        StringBuilder pairedBuilders = rewritersPairing(fxc,for2xqList,orderList);

        String textForReturn = fxc.returnClause().xq().getText();
        Set<String> returnedVars = new HashSet<>();

        for(int i=0; i<textForReturn.length(); i++) {
            if(textForReturn.charAt(i) == '$') {
                for(int j=i+1; j<textForReturn.length(); j++) {
                    char c = textForReturn.charAt(j);
                    if(c == ',' || c == '/' || c == ' ' || c == '}') {
                        returnedVars.add(textForReturn.substring(i, j));
                        i = j;
                        break;
                    }
                }
            }
        }

        for(String var : returnedVars) {
            String replacedText = "$tuple/" + var.substring(1) + "/" + "*";
            //$ in replaceAll is a special sign
            var = Pattern.quote("$") + var.substring(1);
            textForReturn = textForReturn.replaceAll(var, Matcher.quoteReplacement(replacedText));
        }

        pairedBuilders.append("return\n");
        pairedBuilders.append(textForReturn);

        return pairedBuilders.toString();
    }
}
