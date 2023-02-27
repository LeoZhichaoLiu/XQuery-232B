package XQuery_expression;

import expression.LogicFilter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicCond implements XQuery {

    final XQuery cond1;
    final LogicFilter.Logic logic;
    final XQuery cond2;

    public LogicCond(XQuery cond1, LogicFilter.Logic logic, XQuery cond2) {
        this.cond1 = cond1;
        this.logic = logic;
        this.cond2 = cond2;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.LogicCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        List<Node> left = this.cond1.search(document);
        List<Node> right = this.cond2.search(document);

        if (this.logic == LogicFilter.Logic.AND) {

            if (left != null && right != null) {
                return Collections.EMPTY_LIST;
            }

        } else if (this.logic == LogicFilter.Logic.OR) {

            if (left != null || right != null) {
                return Collections.EMPTY_LIST;
            }

        } else {
            throw new Exception ("Logic Type is Wrong!");
        }

        return null;
    }
}
