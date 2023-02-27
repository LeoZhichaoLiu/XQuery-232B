package XQuery_expression;

import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ApXq implements XQuery {

    final List<Node> ap_list;

    public ApXq(List<Node> input) {
        ap_list = input;
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        List<Node> res = new ArrayList<>();
        for (Node node : ap_list) {
            res.add(node.cloneNode(true));
            //res.add(node);
        }
        return res;

    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.ApXq;
    }

}
