package expression;

import java.util.*;
import org.w3c.dom.Node;

public class DoubleRp implements Expression {

    public enum Operator {
        SSLASH,
        DSLASH,
        COMMA;
    }

    final Expression rp1;
    final Operator operator;
    final Expression rp2;

    public DoubleRp (Expression rp1, Operator operator, Expression rp2) {

        this.rp1 = rp1;
        this.operator = operator;
        this.rp2 = rp2;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {

        List<Node> leftInput = rp1.search(input);
        List<Node> res = new ArrayList<>();

        if (operator == operator.SSLASH) {
            res = rp2.search(leftInput);

        } else if (operator == operator.DSLASH) {
            List<Node> descendant = searchDescendant(leftInput);
            res = rp2.search(descendant);

        } else if (operator == operator.COMMA) {
            List<Node> rightInput = rp2.search(input);
            res.addAll(leftInput);
            res.addAll(rightInput);

        } else {
            throw new Exception("Operator has issue");
        }

        return res;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DoubleRp that = (DoubleRp) o;
        return Objects.equals(rp1, that.rp1) && operator == that.operator && Objects.equals(rp2, that.rp2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp1, operator, rp2);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.rp1.toString());
        str.append(this.operator.toString());
        str.append(this.rp2.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.DoubleRp;
    }
}
