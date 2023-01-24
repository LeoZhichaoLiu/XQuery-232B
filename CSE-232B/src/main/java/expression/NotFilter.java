package expression;

import org.w3c.dom.Node;
import java.util.*;

public class NotFilter implements Expression {

    final Expression f;

    public NotFilter (Expression f) {
        this.f = f;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
        List<Node> res = new ArrayList<>(input);
        List<Node> filterNodes = f.search(input);

        for (Node item : filterNodes) {
            if (res.contains(item)) {
                res.remove(item);
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
        NotFilter that = (NotFilter) o;
        return Objects.equals(f, that.f);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append("not ");
        str.append(f.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NotFilter;
    }
}
