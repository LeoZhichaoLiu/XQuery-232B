package expression;

import org.w3c.dom.Node;
import java.util.*;

public class ConstantFilter implements Expression {

    final Expression rp;
    final String constant;

    public ConstantFilter (Expression rp, String constant) {
        this.rp = rp;
        this.constant = constant;
        System.out.println("hahaha");
        System.out.println(constant);
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
        List<Node> res = new ArrayList<>();
        for (Node node : input) {
            List<Node> f = rp.search(input);
            for (Node item : f) {
                if (item.getNodeValue().equals(constant)) {
                    res.add(node);
                    break;
                }
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ConstantFilter that = (ConstantFilter) o;
        return Objects.equals(rp, that.rp) && constant == that.constant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp, constant);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.rp.toString());
        str.append("=");
        str.append(constant);
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ConstantFilter;
    }
}
