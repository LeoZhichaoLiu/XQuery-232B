package visitor;

import expression.*;
import parsers.*;
import parsers.XPathLexer;
import parsers.XPathParser;
import xQuery_parsers.*;
import XQuery_expression.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.File;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XQueryBuilder extends XQueryBaseVisitor<XQuery> {

    Map<String, List<Node>> map;
    //Stack<Map<String, List<Node>>> map_stack;
    ExpressionBuilder expressionBuilder;
    Document document;

    public XQueryBuilder (Document document) throws Exception {
        this.map = new HashMap<>();
        //this.map_stack = new Stack<>();
        this.expressionBuilder = new ExpressionBuilder();
        this.document = document;
    }

    @Override
    public XQuery visitVarXq(XQueryParser.VarXqContext ctx) {
        List<Node> res = map.get(ctx.Var().getText());
        return new VarXq(new ArrayList<>(res));
    }

    @Override
    public XQuery visitStrXq(XQueryParser.StrXqContext ctx) {
        return new StrXq(ctx.stringConstant().ID().getText());
    }

    @Override
    public XQuery visitApXq(XQueryParser.ApXqContext ctx) {
        List<Node> res = new ArrayList<>();
        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder doc = documentFactory.newDocumentBuilder();
            res = Search(ctx.ap().getText(), doc);
        } catch (Exception e) {

        }
        return new ApXq(res);
    }

    @Override
    public XQuery visitParaXq(XQueryParser.ParaXqContext ctx) {
        return new ParaXq(visit(ctx.xq()));
    }

    @Override
    public XQuery visitCommaXq(XQueryParser.CommaXqContext ctx) {
        return new CommaXq(visit(ctx.xq(0)), visit(ctx.xq(1)));
    }

    @Override
    public XQuery visitSlashXq(XQueryParser.SlashXqContext ctx) {
        XPathLexer lexer = new XPathLexer(CharStreams.fromString(ctx.rp().getText()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Expression rp = expressionBuilder.visit(new XPathParser(tokens).rp());

        if (ctx.slash().getText().equals("/")) {
            return new SlashXq(visit(ctx.xq()), SlashXq.Operator.DSLASH, rp);
        }
        return new SlashXq(visit(ctx.xq()), SlashXq.Operator.SSLASH, rp);
    }

    @Override
    public XQuery visitTagCurlyXq(XQueryParser.TagCurlyXqContext ctx) {
        return new TagCurlyXq(ctx.tagName1().tagName().ID().getText(), visit(ctx.xq()));
    }

    @Override
    public XQuery visitFunctionXq(XQueryParser.FunctionXqContext ctx) {

        List<Node> res = new ArrayList<>();

        try {
            // We use helper function to implement recursion on the whole functionXq, the
            // key idea is to use recursion to avoid duplicated counts in for clause
            // We pass res List to record all the return nodes according to return clause.
            functionXq_handler(ctx, 0, res);
        } catch (Exception e) {}

        return new FunctionXq(res);
    }

    public void functionXq_handler(XQueryParser.FunctionXqContext ctx, int k, List<Node> res) throws Exception {

        // The termination base case is when k equals the size of all forClause, we then handle the let, where, and return
        if (k == ctx.forClause().Var().size()) {

            if (ctx.letClause() != null) {
                // If there is let clause, we try to update map according to the current for clause status
                List<TerminalNode> name_list = ctx.letClause().Var();
                List<XQueryParser.XqContext> xq_list = ctx.letClause().xq();
                for (int i = 0; i < name_list.size(); i++) {
                    List<Node> nodes = visit(xq_list.get(i)).search(document);
                    map.put(name_list.get(i).getText(), nodes);
                }
            }

            if (ctx.whereClause() == null ) {
                // Based on return clause, use search to get all answer nodes, add to res list
                res.addAll(visit(ctx.returnClause().xq()).search(document));
            } else {
                List<Node> condition_list = visit(ctx.whereClause().cond()).search(document);
                if (condition_list != null && condition_list.size() != 0) {
                    // Based on return clause, use search to get all answer nodes, add to res list
                    res.addAll(visit(ctx.returnClause().xq()).search(document));
                }
            }
            return;
        }

        // For each iteration, get the name and all corresponding node result
        String name = ctx.forClause().Var(k).getText();
        List<Node> node_list = visit(ctx.forClause().xq(k)).search(document);

        // We use recursion to step by step loop through all possible combination of for clauses
        for (Node item : node_list) {
            // Each time we keep old map, and update up map with each for claus
            Map<String, List<Node>> restore = new HashMap<>(map);
            map.put(name, Arrays.asList(item));
            // Then use recursion to next step (k+1)
            functionXq_handler(ctx, k+1, res);
            // When we return to last step, restore the map to origin.
            map = restore;
        }
    }





    public List<Node> Search(String query, DocumentBuilder documentBuilder) throws Exception{

        List<Node> cur_position = new ArrayList<>();
        XPathLexer lexer = new XPathLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XPathParser parser = new XPathParser(tokens);
        ParserRuleContext tree = parser.ap();

        ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        expression.AbsolutePath root = (AbsolutePath) expressionBuilder.visit(tree);

        //Interface for expressions
        File inputStream = new File(root.returnDoc());
        Document doc = documentBuilder.parse(inputStream);

        //System.out.println(doc.getDocumentElement().getNodeName());
        cur_position.add(doc);
        return root.search(cur_position);
    }

}
