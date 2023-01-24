package expression;

import org.w3c.dom.Node;

import java.util.List;
import java.util.Objects;

public class ParameterFilter implements Expression {

    final Expression filter;

    public ParameterFilter (Expression filter) {
        this.filter = filter;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
        return filter.search(input);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ParameterFilter that = (ParameterFilter) o;
        return Objects.equals(filter, that.filter) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append("(");
        str.append(this.filter.toString());
        str.append(")");
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ParameterFilter;
    }


}
