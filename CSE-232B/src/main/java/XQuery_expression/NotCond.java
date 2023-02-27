package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class NotCond implements XQuery{

    final XQuery cond;

    public NotCond(XQuery cond) {
        this.cond = cond;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.NotCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        List<Node> res = this.cond.search(document);
        if (res == null){
            return Collections.emptyList();
        }
        return null;
    }
}
