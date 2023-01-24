package expression;

import java.util.*;
import org.w3c.dom.*;

public class AttTagRp implements Expression {

    enum Type {
        Attribute,
        Tag;
    }

    final Type type;
    final String str;

    public AttTagRp(Type type, String str) {
        this.type = type;
        this.str = str;
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception {
        List<Node> res = new ArrayList<>();

        for (Node node : input) {
            if (type == Type.Attribute) {
                Node item = node.getAttributes().getNamedItem(str);
                res.add(item);

            } else if (type == Type.Tag) {
                NodeList childNodes = node.getChildNodes();
                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node item = childNodes.item(i);

                    if (item.getNodeType() == Node.ELEMENT_NODE && item.getNodeName() == str) {
                        res.add(item);
                    }
                }

            } else {
                throw new Exception("AttTag Rp has issue");
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
        AttTagRp that = (AttTagRp) o;
        return Objects.equals(type, that.type) && Objects.equals(str, that.str) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, str);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.type.toString());
        str.append(this.str);
        return str.toString();
    }

    public ExpressionKind getExpressionKind() {
        return ExpressionKind.AttTagRp;
    }

}
