package expression;

import java.util.*;
import org.w3c.dom.*;

public class SingleRp implements Expression {

    enum Value {
        CURRENT,
        PARENT,
        ALL,
        TEXT;
    }

    final Value value;

    public SingleRp(Value value) {

        this.value = value;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception  {
        List<Node> res = new ArrayList<>();

        if (value == Value.CURRENT) {
            return input;

        } else if (value == Value.PARENT) {
            for (Node node : input) {
                if (!(node instanceof Document)) {
                    res.add(node.getParentNode());
                }
            }

        } else {
            for (Node node : input) {
                NodeList childNodes = node.getChildNodes();

                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node item = childNodes.item(i);

                    if (value == Value.ALL) {
                        res.add(item);

                    } else if (value == Value.TEXT) {
                        if (item.getNodeType() == Node.TEXT_NODE) {
                            res.add(item);
                        }

                    } else {
                        throw new Exception("Single Rp has issue");
                    }
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
        SingleRp that = (SingleRp) o;
        return Objects.equals(value, that.value) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.value.toString());
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.SingleRp;
    }
}
