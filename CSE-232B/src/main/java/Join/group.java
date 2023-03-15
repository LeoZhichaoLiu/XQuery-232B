package Join;

import java.util.*;
import xQuery_parsers.*;

public class group {

    public LinkedHashMap<String, String> forClause_map;
    public List<String[]> attr_list;

    public group (LinkedHashMap<String, String> map, List<String[]> list) {
        this.forClause_map = map;
        this.attr_list = list;
    }

    public String For2Function () {

        StringBuffer sb = new StringBuffer();

        // First convert forClause
        sb.append("for ");
        for (String var : forClause_map.keySet()) {
            String xq = forClause_map.get(var);
            sb.append(var + " in " + xq + ",\n");
        }
        sb.deleteCharAt(sb.length()-2);


        // Then try to see whether there is where clause
        boolean hasCond = false;
        for (String[] two_att : attr_list) {
            String att1 = two_att[0].split("/")[0];
            String att2 = two_att[1].split("/")[0];

            boolean check = checkAtt(att1, att2);

            // If there is eq conditions that cannot be used as join, we add this where to str
            if (check) {
                sb.append("where " + two_att[0] + " eq " + two_att[1] + ",\n");
                hasCond = true;
            }
        }
        if (hasCond) {
            sb.deleteCharAt(sb.length()-2);
        }


        // Finally convert return clause
        sb.append("return <tuple>{\n");

        for (String var : forClause_map.keySet()) {

            // We need to exclude $ to get its tag
            String varStr = var.substring(1);
            sb.append("\t<" + varStr + ">{" + var + "}</" + varStr + ">");
            sb.append(",\n");
        }
        sb.deleteCharAt(sb.length()-2);
        sb.append("}</tuple>, ");

        return sb.toString();
    }


    // Check whether it contains where condition that need to be included
    public boolean checkAtt (String att1, String att2) {

        //System.out.println(att1 + " " + att2);
        boolean check = (forClause_map.containsKey(att1) && forClause_map.containsKey(att2))
                         || att1.charAt(0) != '$' || att2.charAt(0) != '$';

        //System.out.println(check);

        return check;
    }
}
