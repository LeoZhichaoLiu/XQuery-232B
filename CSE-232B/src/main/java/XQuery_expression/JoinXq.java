package XQuery_expression;

import java.util.*;
import org.w3c.dom.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

public class JoinXq implements XQuery {

    XQuery xq1;
    XQuery xq2;
    List<String> attrList1;
    List<String> attrList2;

    public JoinXq(XQuery xq1, XQuery xq2, List<String> attrList1, List<String> attrList2) {
        this.xq1 = xq1;
        this.xq2 = xq2;
        this.attrList1 = attrList1;
        this.attrList2 = attrList2;
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        List<Node> res = new ArrayList<>();
        List<Node> res1 = xq1.search(document);
        List<Node> res2 = xq2.search(document);
        Map<String, List<Node>> hash_table = new HashMap<>();

        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");

        // If any one of the attribute list is empty, simply put all combinations into res
        if (attrList1.size() == 0 || attrList2.size() == 0) {
            for (Node node1 : res1) {
                for (Node node2 : res2) {
                    Element tag = document.createElement("tuple");
                    // put all node1's children into tuple tag.
                    NodeList match_child_list = node1.getChildNodes();
                    for (int i = 0; i < match_child_list.getLength(); i++) {
                        tag.appendChild(match_child_list.item(i).cloneNode(true));
                    }
                    // Put all node2's children into tuple tag.
                    NodeList self_child_list = node2.getChildNodes();
                    for (int i = 0; i < self_child_list.getLength(); i++) {
                        tag.appendChild(self_child_list.item(i).cloneNode(true));
                    }
                    res.add(tag);
                }
            }
            return res;
        }

        //System.out.println(res1.size());

        // put xq1's result into hash_table with arrtList1's standard
        for (Node node : res1) {
            String hash_key = calculateKey(node, attrList1, tf);

            //System.out.println(hash_key);
            if (!hash_table.containsKey(hash_key)) {
                List<Node> list = new ArrayList<>();
                list.add(node);
                hash_table.put(hash_key, list);
            } else {
                List<Node> list = hash_table.get(hash_key);
                list.add(node);
            }
        }

        //System.out.println(hash_table.size());
        for (String item : hash_table.keySet()) {
            //System.out.println(item);
        }

        // Then search xq2's result, combine every matching results with matched xq1
        for (Node node : res2) {

            // For each xq2, try to calculate its hash_key, find its matched xq1, and put them into tuple tag.
            String hash_key = calculateKey(node, attrList2, tf);
            //System.out.println(hash_key);

            // Use hash_table (which record xq1's information) to find the match xq1 with each xq2
            if (hash_table.containsKey(hash_key)) {
                List<Node> match_list = hash_table.get(hash_key);

                for (Node match_node : match_list) {
                    Element tag = document.createElement("tuple");

                    // Put each match node's information (its children) into tuple tag.
                    NodeList match_child_list = match_node.getChildNodes();
                    for (int i = 0; i < match_child_list.getLength(); i++) {
                        tag.appendChild(match_child_list.item(i).cloneNode(true));
                    }

                    // Put each self node's information (its children) into tuple tag.
                    NodeList self_child_list = node.getChildNodes();
                    for (int i = 0; i < self_child_list.getLength(); i++) {
                        tag.appendChild(self_child_list.item(i).cloneNode(true));
                    }
                    // Put each tag into res for return value
                    res.add(tag);
                }
            }
        }
        return res;
    }

    /*
     * For each node, try to extract all of the children with same attribute names, and
     * transfer to string for matching (in hashtable)
     */
    public String calculateKey (Node node, List<String> attrList, Transformer tf) throws Exception {

        NodeList child_list = node.getChildNodes();
        Map<String, Node> str_node_map  = new HashMap<>();

        // We use map to record each string to each children node
        for (int i = 0; i < child_list.getLength(); i++) {
            String child_name = child_list.item(i).getNodeName();
            //System.out.println(child_name);
            str_node_map.put(child_name, child_list.item(i));
        }

        // Then for each attribute name, we try to extract the matched node, and convert it to
        // String
        StringBuffer sb = new StringBuffer();
        for (String str : attrList) {
            Node item = str_node_map.get(str.substring(1));
            String node_str = item.getTextContent();
            sb.append("@" + node_str);
            //System.out.println(node_str);
            //System.out.println();
        }

        //System.out.println(sb.toString());

        return sb.toString();
    }


    @Override
    public XQuery.XQueryKind getXQueryKind() {
        return XQuery.XQueryKind.JoinXq;
    }
}
