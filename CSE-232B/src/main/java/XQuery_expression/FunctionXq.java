package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class FunctionXq implements XQuery{

    final List<Node> function_list;
    final String docName;

    public FunctionXq (List<Node> input, String docName) {
        function_list = input;
        this.docName = docName;
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        return function_list;
    }

    @Override
    public String getDocName() {
        return docName;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.FunctionXq;
    }
}
