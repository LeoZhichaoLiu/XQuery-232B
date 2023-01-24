package expression;

import java.util.*;
import org.w3c.dom.*;

public class ParameterRp implements Expression {

    final Expression rp;

    public ParameterRp (Expression rp) {
        this.rp = rp;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
        return rp.search(input);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ParameterRp that = (ParameterRp) o;
        return Objects.equals(rp, that.rp) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rp);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append("(");
        str.append(this.rp.toString());
        str.append(")");
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ParameterRp;
    }
}
