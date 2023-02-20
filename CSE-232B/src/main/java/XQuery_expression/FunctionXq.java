package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class FunctionXq implements XQuery{

    final Map<String, List<Node>> map;

    public FunctionXq () {

    }

    @Override
    public List<Node> search (Document document) throws Exception {

        List<Node> res = new ArrayList<>();
        return res;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.FunctionXq;
    }
}
