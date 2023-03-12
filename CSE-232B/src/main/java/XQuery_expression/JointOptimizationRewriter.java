package XQuery_expression;
import org.antlr.v4.runtime.misc.Pair;
import xQuery_parsers.XQueryParser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class JointOptimizationRewriter {

    public Map<String,String> for2xqMap=new HashMap<>();

    public Map<Integer,String> orderMap=new HashMap<>();
    private List<Map<String, String>> for2xqList = new ArrayList<>();
    private List<Map<Integer, String>> orderList = new ArrayList<>();
    private List<Pair<String,String>> condPairs=new ArrayList<>();
    private List<List<Pair<String, String>>> whereList = new ArrayList<>();


    private void conditionBuilder(XQueryParser.FunctionXqContext fxc){

        String[] multipleWheres = fxc.whereClause().cond().getText().split("and");

        for(String where:multipleWheres){
            String[] xqList=where.split("eq|=");
            String left=xqList[0].trim();
            String right=xqList[1].trim();
            for (int i = 0; i < this.for2xqList.size(); i++) {
                if (this.for2xqList.get(i).containsKey(left) || this.for2xqList.get(i).containsKey(right)) {
                    this.whereList.get(i).add(new Pair<>(left, right));
                }
            }
        }
    }

    private List rewriterBuilder(){
        List<JointOptimizationRewriter> rewriters=new ArrayList<>();

        for(int i=0;i< this.for2xqList.size();i++){
            JointOptimizationRewriter r= new JointOptimizationRewriter();

            r.for2xqMap.clear();
            r.for2xqMap.putAll(this.for2xqList.get(i));
            r.orderMap.putAll(this.orderList.get(i));

            r.condPairs.clear();
            r.condPairs.addAll(this.whereList.get(i));

            rewriters.add(r);
        }
        return rewriters;
    }

    private ArrayList rewritersPairing(List<JointOptimizationRewriter> rewriters) {
        // We store the result to this arrayList and output as a string format
        ArrayList builder = new ArrayList();
        builder.add(rewriters.get(0).toString());

        Map<Integer, Boolean> visited = new HashMap<>();
        visited.put(0,true);
        Set<String> set = new HashSet<>(this.for2xqList.get(0).keySet());
        for (int i = 1; i < this.for2xqList.size(); i++) {
            visited.put(i, false);
        }

        int num = 0;
        while (visited.values().contains(false)) {

            num=(int) visited.values().stream().filter(x->x==false).count();

            for (int i = 1; i < this.for2xqList.size(); i++) {
                if (visited.get(i)) {
                    continue;
                }

                List<String> condLeft = new ArrayList<>();
                List<String> condRight = new ArrayList<>();
                for (Pair<String, String> p : whereList.get(i)) {
                    if (set.contains(p.a) && this.for2xqList.get(i).containsKey(p.b)) {
                        condLeft.add(p.a);
                        condRight.add(p.b);
                    } else if (set.contains(p.b) && this.for2xqList.get(i).containsKey(p.a)) {
                        condLeft.add(p.b);
                        condRight.add(p.a);
                    }
                }

                if (!condLeft.isEmpty()) {
                    visited.put(i, true);
                    set.addAll(for2xqList.get(i).keySet());
                    builder.add(0, "join (");
                    builder.add(rewriters.get(i).toString());
                    builder.add("[");
                }

                for (String left : condLeft) {
                    //to remove $, make sure whether it should be changed
                    builder.add(left.substring(1));
                    builder.add(",");
                }

                builder.remove(builder.size() - 1);
                builder.add("], ");
                builder.add("[");

                for (String right : condRight) {
                    //And this one
                    builder.add(right.substring(1));
                    builder.add(",");
                }

                builder.remove(builder.size() - 1);
                builder.add("], ");
                builder.add("\n");
                builder.add("),\n");
            }

            if (num == (int) visited.values().stream().filter(x->x==false).count()){
                int index = IntStream.range(0, this.for2xqList.size()).filter(i -> visited.get(i)==false).findFirst().orElse(-1);
                if(index == -1) {
                    continue;
                }
                visited.put(index,true);
                set.addAll(this.for2xqList.get(index).keySet());

                builder.add(0,"join (");
                builder.add(this.for2xqList.get(index).keySet());
                builder.add("[], []\n),\n");
            }
        }

        builder.remove(builder.size()-2);
        builder.add(0,"for $tuple in ");

        return builder;
    }

    public String rewriter(XQueryParser.FunctionXqContext fxc){

        for(int i=0;i<fxc.forClause().Var().size();i++){
            String var=fxc.forClause().Var(i).getText();
            String xq=fxc.forClause().xq(i).getText();
            String root=xq.split("/")[0];

            boolean flag=false;

            for(int j=0;j<this.for2xqList.size();j++){
                if(this.for2xqList.get(j).containsKey(root)){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                Map<String, String> hash = new HashMap<>();
                hash.put(var, xq);
                this.for2xqList.add(hash);
                Map<Integer, String> orderMap = new HashMap<>();
                orderMap.put(0, var);
                this.orderList.add(orderMap);
            }
        }

        conditionBuilder(fxc);

        List<JointOptimizationRewriter> rewriters=rewriterBuilder();

        ArrayList<String> pairedBuilders = rewritersPairing(rewriters);

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

        pairedBuilders.add("return\n");
        pairedBuilders.add(textForReturn);


        StringBuilder sb = new StringBuilder();
        for (String s : pairedBuilders) {
            sb.append(s);
            sb.append(", ");
        }
        return pairedBuilders.toString();
    }

}
