package XQuery_expression;

import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ParaXq implements XQuery {

    final XQuery xq;

    public ParaXq(XQuery xq) {
        this.xq = xq;
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        List<Node> res = xq.search(document);
        return res;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.ParaXq;
    }
}
