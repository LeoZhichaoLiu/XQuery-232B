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
