package XQuery_expression;

import expression.LogicFilter;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicCond implements XQuery {

    final XQuery xq1;
    final LogicFilter.Logic logic;
    final XQuery xq2;

    public LogicCond(XQuery xq1, LogicFilter.Logic logic, XQuery xq2) {
        this.xq1 = xq1;
        this.logic = logic;
        this.xq2 = xq2;
    }

    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.LogicCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        List<Node> left = this.xq1.search(document);
        List<Node> right = this.xq2.search(document);
        List<Node> res = new ArrayList<>();

        if (this.logic == LogicFilter.Logic.AND) {

            if (left != null && right != null) {
                return Collections.EMPTY_LIST;
            }
        } else if (this.logic == LogicFilter.Logic.OR) {

            if (left != null || right != null) {
                return Collections.EMPTY_LIST;
            }

        }else {
            throw new Exception ("Logic Type is Wrong!");
        }

        return null;
    }
}
