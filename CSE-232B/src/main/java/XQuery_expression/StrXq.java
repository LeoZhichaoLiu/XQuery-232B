package XQuery_expression;

import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class StrXq implements XQuery {

    String strConstant;

    public StrXq (String strConstant) {
        this.strConstant = strConstant;
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        List<Node> res = new ArrayList<>();
        Node element = document.createTextNode(strConstant);
        res.add(element);
        return res;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.StrXq;
    }
}
