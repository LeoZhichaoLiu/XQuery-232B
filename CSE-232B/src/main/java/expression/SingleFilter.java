package expression;

import org.w3c.dom.Node;

import java.util.*;

public class SingleFilter implements Expression {

    final Expression rp;

    public SingleFilter (Expression rp) {
        this.rp = rp;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception  {
        List<Node> res = new ArrayList<>();

        for (Node node : input) {
            List<Node> check = rp.search(Arrays.asList(node));
            if (!check.isEmpty()) {
                res.add(node);
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
        SingleFilter that = (SingleFilter) o;
        return Objects.equals(rp, that.rp) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.rp.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.SingleFilter;
    }
}