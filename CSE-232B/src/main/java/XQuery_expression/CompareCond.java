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
    final XQuery rp1;
    final DoubleFilter.Compare cp;
    final XQuery rp2;

    public CompareCond(XQuery rp1, DoubleFilter.Compare cp, XQuery rp2) {
        this.rp1 = rp1;
        this.cp = cp;
        this.rp2 = rp2;
    }


    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.CompareCond;
    }

    @Override
    //unsure about the asList part.
    public List<Node> search(Document document) throws Exception {
        List<Node> left = this.rp1.search(document);
        List<Node> right = this.rp2.search(document);
        List<Node> res = new ArrayList<>();

        if (cp == DoubleFilter.Compare.EQ_N || cp == DoubleFilter.Compare.EQ) {
            for (Node n1 : left) {
                for (Node n2 : right) {
                    if (n1.isEqualNode(n2))
                        res.add(n1);
                }
            }
        } else if (cp == DoubleFilter.Compare.IS_N || cp == DoubleFilter.Compare.IS) {
            for (Node n1 : left) {
                for (Node n2 : right) {
                    if (n1.isSameNode(n2))
                        res.add(n1);
                }
            }
        }else{
            throw new Exception ("Compare Type is Wrong!");
        }
        return res;
    }
}
