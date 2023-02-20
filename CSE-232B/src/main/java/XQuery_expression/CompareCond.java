package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class CompareCond implements XQuery{
    final XQuery xq1;
    final XQuery xq2;

    public CompareCond(XQuery xq1, XQuery xq2) {
        this.xq1 = xq1;
        this.xq2 = xq2;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.CompareCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        List<Node> left=this.xq1.search(document);
        List<Node> right=this.xq2.search(document);
        for(Node l:left){
            for(Node r:right){
                if(l.isEqualNode(r)){
                    return Collections.emptyList();
                }
            }
        }
        return null;
    }
}
