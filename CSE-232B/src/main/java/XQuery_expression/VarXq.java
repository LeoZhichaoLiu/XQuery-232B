package XQuery_expression;

import java.util.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class VarXq implements XQuery {

    final List<Node> var_list;

    public VarXq (List<Node> input) {
        var_list = input;
    }

    @Override
    public List<Node> search (Document document) throws Exception {
        return var_list;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.VarXq;
    }
}
