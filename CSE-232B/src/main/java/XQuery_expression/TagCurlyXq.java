package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.*;

public class TagCurlyXq implements XQuery {

    String tag;
    XQuery xq;

    public TagCurlyXq (String tag, XQuery xq) {
        this.tag = tag;
        this.xq = xq;
    }

    @Override
    public String getDocName() {
        return xq.getDocName();
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        List<Node> input = xq.search(document);
        //DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        //DocumentBuilder docBuilder = documentFactory.newDocumentBuilder();
        //Document doc = docBuilder.newDocument();

        //System.out.println(tag + "  " + input.get(0).getTextContent());

        Node res_node = document.createElement(tag);
        //Node res_node = doc.createElement(tag);

        for (Node item : input) {
            res_node.appendChild(item.cloneNode(true));
        }

        return Arrays.asList(res_node);
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.TagCurlyXq;
    }
}
