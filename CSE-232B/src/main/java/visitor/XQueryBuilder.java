package visitor;

import expression.*;
import xQuery_parsers.*;
import XQuery_expression.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import java.util.*;
import org.antlr.v4.runtime.*;

public class XQueryBuilder extends XQueryBaseVisitor<XQuery> {

    Map<String, List<Node>> map;
    Stack<Map<String, List<Node>>> map_stack;
    ExpressionBuilder expressionBuilder;
    Document document;

    public XQueryBuilder (Document document) throws Exception {
        this.map = new HashMap<>();
        this.map_stack = new Stack<>();
        this.expressionBuilder = new ExpressionBuilder();
        this.document = document;
    }


    @Override
    public XQuery visitFunctionXq(XQueryParser.FunctionXqContext ctx) {

        List<Node> res = new ArrayList<>();

        int num = ctx.forClause().Var().size();
        for (int i = 0; i < num; i++) {
            String name = ctx.forClause().Var(i).getText();
            List<Node> node_list = visit(ctx.forClause().xq(i)).search(document);
            for (Node item : node_list) {
                //Map<String, List<Node>> map = new HashMap<>(map)
            }
            map.put(name, node_list);
        }

        if (ctx.letClause() != null) {
            List<TerminalNode>

        }

        return new VarXq(res);
    }


}
