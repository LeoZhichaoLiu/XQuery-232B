package expression;

import java.util.*;
import org.w3c.dom.*;

public class FilterRp implements Expression {

    final Expression rp;
    final Expression filter;

    public FilterRp (Expression rp, Expression filter) {
        this.rp = rp;
        this.filter = filter;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
//        System.out.println(121212);
        List<Node> left = rp.search (input);
        List<Node> res = filter.search (left);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        FilterRp that = (FilterRp) o;
        return Objects.equals(rp, that.rp) &&  Objects.equals(filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp, filter);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.rp.toString());
        str.append("[");
        str.append(this.filter.toString());
        str.append("]");
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.FilterRp;
    }
}
