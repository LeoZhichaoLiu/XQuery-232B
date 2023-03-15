package Join;

import Join.group;
import org.antlr.v4.runtime.tree.TerminalNode;
import xQuery_parsers.*;
import java.util.regex.*;

import java.util.*;


public class JoinOptimization {

    // List record the whole dependent group, each group has mapping from many var to xq in order
    List<LinkedHashMap<String, String>> dependency_group;
    // map to record each id group's attribute lists; each list has many [att1, att2].
    Map <Integer, List<String[]>> attr_map;
    // The Map storing individual group, which return statement
    Map<Integer, group> group_list;

    public JoinOptimization () {
        dependency_group = new ArrayList<>();
        attr_map = new HashMap<>();
        group_list = new HashMap<>();
    }

    public String rewrite(XQueryParser.FunctionXqContext ctx) {

        StringBuffer sb = new StringBuffer();

        List<TerminalNode> var_list = ctx.forClause().Var();
        List<XQueryParser.XqContext> xq_list = ctx.forClause().xq();

        // We first extract the forClause, and use dependency group to record their dependency.
        for (int i = 0; i < var_list.size(); i++) {

            String varName = var_list.get(i).getText();
            String xq_str = xq_list.get(i).getText();

            String var_father = xq_str.split("/")[0];
            //System.out.println(varName + "   " + var_father);
            Boolean check = checkDependency (dependency_group, var_father, varName, xq_str);

            if (check == false) {
                LinkedHashMap<String, String> map = new LinkedHashMap<>();
                map.put(varName, xq_str);
                dependency_group.add(map);
            }
        }

        int map_size = dependency_group.size();

        System.out.println("\n" + map_size);

        // Now extract the where statement, and record all condition like "var1 = var2" or
        // "var1 eq var2", map them to the corresponding dependency_group (with integer 0 to size).
        //Map <Integer, List<String[]>> attr_map = new HashMap<>();
        String where_statement = ctx.whereClause().cond().getText();
        setUpAttributes(attr_map, map_size, where_statement, dependency_group);

        // Now, we have "map_size" dependent groups, we then try to initial each as one objects,
        // since each of them needs to generate own for where return statement.
        for (int i = 0; i < map_size; i++) {
            group temp_group = new group(dependency_group.get(i), attr_map.get(i));
            group_list.put(i, temp_group);
        }

        // After we collect individual groups, extract attribute list, we then try to pair them
        // one by one to form the join statement.
        groupPairing(sb, map_size);

        // Start writing the return statement, using the function createReturn.
        sb.append("return\n");
        String return_statement = ctx.returnClause().xq().getText();
        sb.append (createReturn(return_statement));

        return sb.toString();
    }


    /*
     * Method used to pair each two group set if they have join connection. Each time put one
     * group joining with visited groups if they have connection, continue to do so.
     */
    public void groupPairing (StringBuffer sb, int map_size) {

        // Then according to the attribute list, we need to combine each two groups together.
        Map<String, String> first_group = dependency_group.get(0);
        Set<String> visited_variable = new HashSet<>();
        Set<Integer> remain_groups = new HashSet<>();

        // We put the first group into the visited set, and continue check for any group that may
        // have join with visited set (all groups), and then perform join.
        visited_variable.addAll(first_group.keySet());
        sb.append(group_list.get(0).For2Function());
        for (int i = 1; i < map_size; i++) {
            remain_groups.add(i);
        }

        // In the while loop, each time we try to see whether we can select one group in
        // remain_groups, and join with the visited_groups.
        while (remain_groups.size() != 0) {

            boolean hasJoin = false;
            List<Integer> remove_ids = new ArrayList<>();

            for (int id : remain_groups) {

                List<String> left_attrList = new ArrayList<>();
                List<String> right_attrList = new ArrayList<>();
                // Extract this id groups' all attributes, check whether visited_variable has other one
                List<String[]> current_att = attr_map.get(id);
                for (String[] two_var : current_att) {
                    String att1 = two_var[0];
                    String att2 = two_var[1];
                    if (visited_variable.contains(att1)) {
                        left_attrList.add(att1);
                        right_attrList.add(att2);

                    } else if (visited_variable.contains(att2)) {
                        left_attrList.add(att2);
                        right_attrList.add(att1);
                    }
                }

                if (left_attrList.size() != 0) {
                    hasJoin = true;
                    // If there is join, put all variables in id group as visited vars
                    visited_variable.addAll(dependency_group.get(id).keySet());
                    // remove the visited id, and create the join text
                    //remain_groups.remove(id);
                    remove_ids.add(id);
                    group id_group = group_list.get(id);
                    String id_statement = id_group.For2Function();
                    createJoin(sb, left_attrList, right_attrList, id_statement);
                }
            }

            for (Integer id : remove_ids) {
                remain_groups.remove(id);
            }

            // In one case, is that for all remaining groups, they cannot join with visited_group
            // In this case, we pick one and join with [], [] to visited_group. Since it is possible
            // that there are joins among remaining groups.
            if (hasJoin == false) {
                int select_id = remain_groups.stream().findFirst().get();
                remain_groups.remove (select_id);
                Set<String> id_variables = dependency_group.get(select_id).keySet();
                visited_variable.addAll(id_variables);

                // We generate empty join with this select_id_group (since it doesn't have join with
                // previous groups)
                String id_statement = group_list.get(select_id).For2Function();
                createJoin(sb, new ArrayList<>(), new ArrayList<>(), id_statement);
            }
        }
        // Delete the last comma, and insert the for statement in the begining.
        sb.deleteCharAt(sb.length()-2);
        sb.insert(0, "for $tuple in ");
    }


    /*
     * Loop through the original statement, and convert each $var to $tuple/var/*
     */
    public String createReturn (String str) {

        int size = str.length();
        Map<String, String> convert_map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == '$') {
                int j = i+1;
                while (j < size) {
                    char varEnd = str.charAt(j);
                    if (varEnd != '/' && varEnd != ',' && varEnd != '}' && varEnd != ' ') {
                        j++;
                    } else {
                        String origin_var = str.substring(i, j);
                        if (!convert_map.containsKey(origin_var)) {
                            String new_var = "$tuple/" + origin_var.substring(1) + "/*";
                            convert_map.put(origin_var, new_var);
                        }
                        i = j;
                        break;
                    }
                }
            }
        }
        for (String var : convert_map.keySet()) {
            //$ in replaceAll is a special sign
            str = str.replaceAll(Pattern.quote("$") + var.substring(1),
                                       Matcher.quoteReplacement(convert_map.get(var)));
        }

        return str;
    }


    /*
     * Method to create join () text, such that combine two for clause with all related
     * attribute list.
     */
    public void createJoin (StringBuffer sb, List<String> left_list, List<String> right_list,
                            String id_statement) {

        int size = left_list.size();
        sb.insert (0, "join (");
        sb.append (id_statement + "[");
        for (int i = 0; i < size-1; i++) {
            sb.append(left_list.get(i));
            sb.append(",");
        }
        if (size > 0) {
            sb.append(left_list.get(size - 1));
        }

        sb.append ("],[");
        for (int i = 0; i < size-1; i++) {
            sb.append(right_list.get(i));
            sb.append(",");
        }
        if (size > 0) {
            sb.append(right_list.get(size - 1));
        }
        sb.append ("]\n");
        sb.append ("),\n");
    }

    /*
     * Loop through the where clause, and try to collect all attribute lists, mapping to dependency
     * group.
     */
    public void setUpAttributes (Map <Integer, List<String[]>> attr_map, int map_size,
                                 String where_statement, List<LinkedHashMap<String, String>> dependency_group) {

        for (int i = 0; i < map_size; i++) {
            attr_map.put(i, new ArrayList<>());
        }

        String[] multipleWheres = where_statement.split("and");
        for (String condition : multipleWheres) {
            String[] two_vars = condition.split("eq|=");
            String var1 = two_vars[0].trim();
            String var2 = two_vars[1].trim();

            // Loop through each dependency group, if group contains var that matches with var1 or var2,
            // meaning it can be join. We record that [var1, var2] into the list of corresponding id.
            for (int i = 0; i < map_size; i++) {
                LinkedHashMap<String, String> temp_map = dependency_group.get(i);
                if (temp_map.containsKey(var1) || temp_map.containsKey(var2)) {
                    List<String[]> attr_list = attr_map.get(i);
                    attr_list.add(new String[]{var1, var2});
                }
            }
        }
    }

    /*
     * Check whether the current var is depend from previous group; if not, it is independent group.
     */
    public boolean checkDependency (List<LinkedHashMap<String, String>> group, String var_father, String varName, String xq_str) {

        for (LinkedHashMap<String, String> map : group) {
            if (map.containsKey(var_father)) {
                map.put(varName, xq_str);
                return true;
            }
        }
        return false;
    }
}