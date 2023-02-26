package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class TagCurlyXq implements XQuery {

    String tag;
    XQuery xq;

    public TagCurlyXq (String tag, XQuery xq) {
        this.tag = tag;
        this.xq = xq;
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        List<Node> input = xq.search(document);
        Node res_node = document.createElement(tag);

        for (Node item : input) {
            if (!Objects.isNull(item)) {
                res_node.appendChild(item);
            }
        }
        return Arrays.asList(res_node);
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.TagCurlyXq;
    }
}
