package XQuery_expression;

import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class CommaXq implements XQuery {

    final XQuery xq1;
    final XQuery xq2;

    public CommaXq(XQuery xq1, XQuery xq2) {
        this.xq1 = xq1;
        this.xq2 = xq2;
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        List<Node> res = new ArrayList<>();
        List<Node> res1 = xq1.search(document);
        List<Node> res2 = xq2.search(document);
        res.addAll(res1);
        res.addAll(res2);
        return res;
    }

    @Override
    public String getDocName() {
        return xq1.getDocName();
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.CommaXq;
    }
}
