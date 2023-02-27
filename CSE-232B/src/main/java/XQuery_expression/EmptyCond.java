package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class EmptyCond implements XQuery{

    final XQuery xq;

    public EmptyCond(XQuery xq) {
        this.xq = xq;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQuery.XQueryKind.EmptyCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        List <Node> check_empty = this.xq.search(document);
        if ( check_empty == null || check_empty.isEmpty() ){
            return Collections.emptyList();
        }
        return null;
    }
}
