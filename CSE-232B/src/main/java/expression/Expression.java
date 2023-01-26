package expression;

import java.util.*;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public interface Expression {

    ExpressionKind getExpressionKind();

    enum ExpressionKind {
        ap,
        DoubleRp,
        SingleRp,
        AttTagRp,
        ParameterRp,
        FilterRp,
        ParameterFilter,
        SingleFilter,
        DoubleFilter,
        ConstantFilter,
        LogicFilter,
        NotFilter;
    }

    List<Node> search (List<Node> input) throws Exception;

    default List<Node> searchDescendant (List<Node> input) {
        List<Node> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        for (Node node : input) {
            queue.add(node);
        }

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            res.add(cur);
            NodeList children = cur.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                queue.add(children.item(i));
            }
        }
        return res;
    }
}
