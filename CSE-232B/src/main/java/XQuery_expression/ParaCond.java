package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class ParaCond implements XQuery{
    final XQuery xq;

    public ParaCond(XQuery xq) {
        this.xq = xq;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQuery.XQueryKind.ParaCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        return this.xq.search(document);
    }
}
