package XQuery_expression;

import expression.DoubleFilter;
import expression.Expression;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareCond implements XQuery {
    final XQuery xq1;
    final DoubleFilter.Compare cp;
    final XQuery xq2;

    public CompareCond(XQuery xq1, DoubleFilter.Compare cp, XQuery xq2) {
        this.xq1 = xq1;
        this.cp = cp;
        this.xq2 = xq2;
    }


    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.CompareCond;
    }

    @Override
    //unsure about the asList part.
    public List<Node> search(Document document) throws Exception {
        List<Node> left = this.xq1.search(document);
        List<Node> right = this.xq2.search(document);

        if (cp == DoubleFilter.Compare.EQ_N || cp == DoubleFilter.Compare.EQ) {
            for (Node n1 : left) {
                for (Node n2 : right) {
                    if (n1.isEqualNode(n2)) {
                        return Collections.EMPTY_LIST;
                    }
                }
            }
        } else if (cp == DoubleFilter.Compare.IS_N || cp == DoubleFilter.Compare.IS) {
            for (Node n1 : left) {
                for (Node n2 : right) {
                    if (n1.isSameNode(n2))
                        return Collections.EMPTY_LIST;
                }
            }
        }else{
            throw new Exception ("Compare Type is Wrong!");
        }
        return null;
    }
}
