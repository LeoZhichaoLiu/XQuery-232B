package expression;

import org.w3c.dom.Node;
import java.util.*;

public class DoubleFilter implements Expression {

    final Expression rp1;
    final Compare cp;
    final Expression rp2;

    public enum Compare {
        EQ_N,
        EQ,
        IS_N,
        IS;
    }

    public DoubleFilter (Expression rp1, Compare cp, Expression rp2) {

        this.rp1 = rp1;
        this.cp = cp;
        this.rp2 = rp2;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception  {

        List<Node> res = new ArrayList<>();

        if (cp == Compare.EQ_N || cp == Compare.EQ) {
            for (Node node : input) {
                List<Node> f1 = rp1.search(Arrays.asList(node));
                List<Node> f2 = rp2.search(Arrays.asList(node));
                boolean isEq = false;
                for (Node n1 : f1) {
                    for (Node n2 : f2) {
                        if (n1.isEqualNode(n2))
                            isEq = true;
                    }
                }
                if (isEq) res.add(node);
            }

        } else if (cp == Compare.IS_N || cp == Compare.IS) {
            for (Node node : input) {
                List<Node> f1 = rp1.search(Arrays.asList(node));
                List<Node> f2 = rp2.search(Arrays.asList(node));
                boolean isEq = false;
                for (Node n1 : f1) {
                    for (Node n2 : f2) {
                        if (n1.isSameNode(n2))
                            isEq = true;
                    }
                }
                if (isEq) res.add(node);
            }

        } else {
            throw new Exception ("Compare has issue");
        }

        return res;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DoubleFilter that = (DoubleFilter) o;
        return Objects.equals(rp1, that.rp1) && cp == that.cp && Objects.equals(rp2, that.rp2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp1, cp, rp2);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.rp1.toString());
        str.append(this.cp.toString());
        str.append(this.rp2.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.DoubleFilter;
    }
}
