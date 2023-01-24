package expression;

import org.w3c.dom.Node;
import java.util.*;

public class LogicFilter implements Expression {

    enum Logic {
        AND,
        OR;
    }

    final Expression f1;
    final Logic logic;
    final Expression f2;

    public LogicFilter (Expression f1, Logic logic, Expression f2) {
        this.f1 = f1;
        this.logic = logic;
        this.f2 = f2;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {

        List<Node> res = new ArrayList<>();

        if (logic == Logic.AND) {

            for (Node node : input) {
                List<Node> left = f1.search(Arrays.asList(node));
                List<Node> right = f2.search(Arrays.asList(node));
                if (!left.isEmpty() && !right.isEmpty()) {
                    res.add(node);
                }
            }

        } else if (logic == Logic.OR) {

            for (Node node : input) {
                List<Node> left = f1.search(Arrays.asList(node));
                List<Node> right = f2.search(Arrays.asList(node));
                if (!left.isEmpty() || !right.isEmpty()) {
                    res.add(node);
                }
            }

        } else {
            throw new Exception ("Logic has issue");
        }

        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LogicFilter that = (LogicFilter) o;
        return Objects.equals(f1, that.f1) && Objects.equals(logic, that.logic) && Objects.equals(f2, that.f2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(f1, logic, f2);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(f1.toString());
        str.append(logic.toString());
        str.append(f2.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.LogicFilter;
    }
}
