package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class LetXq implements XQuery {

    final XQuery xq;
    final String docName;

    public LetXq (XQuery xq, String docName) {
        this.xq = xq;
        this.docName = docName;
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        return xq.search(document);
    }

    @Override
    public String getDocName() {
        return docName;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.LetXq;
    }

}
