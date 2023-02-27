package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class ParaCond implements XQuery{
    final XQuery cond;

    public ParaCond(XQuery cond) {
        this.cond = cond;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQuery.XQueryKind.ParaCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        return this.cond.search(document);
    }
}
