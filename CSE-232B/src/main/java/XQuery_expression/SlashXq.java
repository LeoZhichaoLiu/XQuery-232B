package XQuery_expression;

import java.util.*;
import expression.Expression;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class SlashXq implements XQuery {

    public enum Operator {
        SSLASH,
        DSLASH,
    }

    final XQuery xq;
    final SlashXq.Operator operator;
    final Expression rp;

    public SlashXq(XQuery xq, SlashXq.Operator operator, Expression rp) {
        this.xq = xq;
        this.operator = operator;
        this.rp = rp;
    }

    @Override
    public String getDocName() {
        return xq.getDocName();
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        List<Node> res1 = xq.search(document);

        if (operator == Operator.SSLASH) {

            Set<Node> clean_duplicate = new HashSet<>(rp.search(res1));
            return new ArrayList<>(clean_duplicate);

        } else if (operator == Operator.DSLASH) {

            List<Node> children = searchDescendant(res1);
            Set<Node> clean_duplicate = new HashSet<>(rp.search(children));
            return new ArrayList<>(clean_duplicate);
        }

        throw new Exception ("Compare has issue");
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.SlashXq;
    }
}
