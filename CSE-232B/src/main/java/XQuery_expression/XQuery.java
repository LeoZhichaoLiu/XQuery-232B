package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public interface XQuery {

    XQueryKind getXQueryKind();

    enum XQueryKind {
        VarXq,
        StrXq,
        ApXq,
        ParaXq,
        CommaXq,
        SlashXq,
        TagCurlyXq,
        FunctionXq,
        LetXq,
        forClause,
        letClause,
        whereClause,
        returnClause,
        CompareCond,
        EmptyCond,
        SomeCond,
        ParaCond,
        LogicCond,
        NotCond
    }

    List<Node> search (Document document) throws Exception;

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
