package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class FunctionXq implements XQuery{

    final List<Node> function_list;

    public FunctionXq (List<Node> input) {
        function_list = input;
    }

    @Override
    public List<Node> search (Document document) throws Exception {

        return function_list;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.FunctionXq;
    }
}
