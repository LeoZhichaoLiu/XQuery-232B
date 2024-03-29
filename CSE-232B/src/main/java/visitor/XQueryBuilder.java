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

    // The Map stores each Var (String) as key, and list of nodes (Variable path) as value
    Map<String, List<Node>> map;
    // The builder to handle the XPath resolver
    ExpressionBuilder expressionBuilder;
    // The document for creating tag element and strConstant element
    Document document;
    DocumentBuilder docbuilder;

    public XQueryBuilder (Document document) throws Exception {
        this.map = new HashMap<>();
        this.expressionBuilder = new ExpressionBuilder();
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        docbuilder = documentFactory.newDocumentBuilder();
        this.document = document;
    }

    @Override
    public XQuery visitJoinXq(XQueryParser.JoinXqContext ctx) {
        return visit(ctx.joinClause());
    }

    @Override
    public XQuery visitJoinClause(XQueryParser.JoinClauseContext ctx) {
        XQuery first = visit(ctx.xq(0));
        XQuery second = visit(ctx.xq(1));

        List<String> attrList1 = new ArrayList<>();
        List<String> attrList2 = new ArrayList<>();

        for (int i = 0; i < ctx.attrList(0).attriName().size(); i++) {
            attrList1.add('$'+ctx.attrList(0).attriName(i).ID().getText());
        }

        for (int i = 0; i < ctx.attrList(1).attriName().size(); i++) {
            attrList2.add('$'+ctx.attrList(1).attriName(i).ID().getText());
        }

        return new JoinXq(first, second, attrList1, attrList2);
    }

    @Override
    public XQuery visitVarXq(XQueryParser.VarXqContext ctx) {
        List<Node> res = map.get(ctx.Var().getText());
        //System.out.println(ctx.Var().getText() + "   " + map.containsKey(ctx.Var().getText()));
        return new VarXq(res);
    }

    @Override
    public XQuery visitStrXq(XQueryParser.StrXqContext ctx) {
        String origin_string = ctx.stringConstant().getText();
        return new StrXq(origin_string.substring(1, origin_string.length()-1));
    }

    @Override
    public XQuery visitApXq(XQueryParser.ApXqContext ctx) {
        List<Node> res = new ArrayList<>();
        String fileName = null;
        //System.out.println("Enter Ap!!!");
        try {
            res = Search(ctx.ap().getText(), this.docbuilder);
            String origin_fileName = ctx.ap().docName().STRING().getText();
            fileName = origin_fileName.substring(1, origin_fileName.length()-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApXq(res, fileName);
    }

    @Override
    public XQuery visitParaXq(XQueryParser.ParaXqContext ctx) {
        return new ParaXq(visit(ctx.xq()));
    }

    @Override
    public XQuery visitCommaXq(XQueryParser.CommaXqContext ctx) {
        //System.out.println(ctx.xq(0).getText() + "       " + ctx.xq(1).getText());
        return new CommaXq(visit(ctx.xq(0)), visit(ctx.xq(1)));
    }

    @Override
    public XQuery visitSlashXq(XQueryParser.SlashXqContext ctx) {
        XPathLexer lexer = new XPathLexer(CharStreams.fromString(ctx.rp().getText()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Expression rp = this.expressionBuilder.visit(new XPathParser(tokens).rp());

        if (ctx.slash().getText().equals("//")) {
            return new SlashXq(visit(ctx.xq()), SlashXq.Operator.DSLASH, rp);
        }
        return new SlashXq(visit(ctx.xq()), SlashXq.Operator.SSLASH, rp);
    }

    @Override
    public XQuery visitTagCurlyXq(XQueryParser.TagCurlyXqContext ctx) {
        return new TagCurlyXq(ctx.tagName1().tagName().ID().getText(), visit(ctx.xq()));
    }

    @Override
    public XQuery visitLetXq(XQueryParser.LetXqContext ctx) {

        Map<String, List<Node>> restore = new HashMap<>(map);
        String docName = visit(ctx.letClause().xq(0)).getDocName();

        // For letXq xQuery, we first visit its letClause to update map, then return xq
        visit(ctx.letClause());
        XQuery res = visit(ctx.xq());

        // We need to return to original map after
        map = restore;
        return new LetXq(res, docName);
    }


    @Override
    public XQuery visitFunctionXq(XQueryParser.FunctionXqContext ctx) {

        List<Node> res = new ArrayList<>();
        String docName = visit(ctx.forClause().xq(0)).getDocName();

        try {
            // We use helper function to implement recursion on the whole functionXq, the
            // key idea is to use recursion to avoid duplicated counts in for clause
            // We pass res List to record all the return nodes according to return clause.
            functionXq_handler(ctx, 0, res);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new FunctionXq(res, docName);
    }


    /*
     * Helper function using recursion to handle the implementation of functionXq
     */
    public void functionXq_handler(XQueryParser.FunctionXqContext ctx, int k, List<Node> res) throws Exception {

        // The termination base case is when k equals the size of all forClause, we then handle the let, where, and return
        if (k == ctx.forClause().Var().size()) {

            if (ctx.letClause() != null) {
                visit(ctx.letClause());
            }

            // If there isn't any satisfied condition in where, just return soon
            if (ctx.whereClause() != null) {
                List<Node> condition_list = visit(ctx.whereClause().cond()).search(document);

                if (condition_list == null) {
                    return;
                }
            }

            // Based on return clause, use search to get all answer nodes, add to res list
            List<Node> return_list = visit(ctx.returnClause().xq()).search(document);
            //System.out.println(return_list.get(0).getTextContent());
            res.addAll(return_list);
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

            // When we return to last step (finish the let where return), restore the map to origin.
            map = restore;
        }
    }

    @Override
    public XQuery visitLetClause(XQueryParser.LetClauseContext ctx) {

        // If there is let clause, we try to update map according to the current for clause status
        List<TerminalNode> name_list = ctx.Var();
        List<XQueryParser.XqContext> xq_list = ctx.xq();
        for (int i = 0; i < name_list.size(); i++) {
            List<Node> nodes = new ArrayList<>();
            try {
                nodes = visit(xq_list.get(i)).search(document);
            } catch (Exception e) {}
            map.put(name_list.get(i).getText(), nodes);
        }

        return visitChildren(ctx);
    }

    @Override
    public XQuery visitCompareCond(XQueryParser.CompareCondContext ctx){
        XQuery xq1 = visit(ctx.xq(0));
        XQuery xq2 = visit(ctx.xq(1));
        DoubleFilter.Compare comp = null;

        if (ctx.comp().getText().equals("=")) {
            comp = DoubleFilter.Compare.EQ;

        } else if (ctx.comp().getText().equals("eq")) {
            comp = DoubleFilter.Compare.EQ_N;

        } else if (ctx.comp().getText().equals("==")) {
            comp = DoubleFilter.Compare.IS;

        } else if (ctx.comp().getText().equals("is")) {
            comp = DoubleFilter.Compare.IS_N;
        }

        return new CompareCond(xq1, comp, xq2);
    }

    @Override
    public XQuery visitEmptyCond(XQueryParser.EmptyCondContext ctx){
        return new EmptyCond(visit(ctx.xq()));
    }

    @Override
    public XQuery visitSomeCond(XQueryParser.SomeCondContext ctx){

        boolean res = false;

        Map<String, List<Node>> restore = new HashMap<>(map);
        try {
            res = SomeCond_handler(ctx, 0, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        map = restore;
        return new SomeCond(res);
    }


    public boolean SomeCond_handler (XQueryParser.SomeCondContext ctx, int k, boolean res) throws Exception {

        if (k == ctx.Var().size()) {
            return visit(ctx.cond()).search(document) != null;

        } else {

            String name = ctx.Var(k).getText();
            List<Node> node_list = visit(ctx.xq(k)).search(document);

            for (Node item : node_list) {
                Map<String, List<Node>> restore = new HashMap<>(map);
                map.put(name, Arrays.asList(item));
                boolean return_res = SomeCond_handler(ctx, k+1, res);

                map = restore;
                res = res | return_res;
            }
        }
        return res;
    }

    @Override
    public XQuery visitParaCond(XQueryParser.ParaCondContext ctx){
        return new ParaCond(visit(ctx.cond()));
    }

    @Override
    public XQuery visitLogicCond(XQueryParser.LogicCondContext ctx){
        XQuery xq1=visit(ctx.cond(0));
        XQuery xq2=visit(ctx.cond(1));
        LogicFilter.Logic logic=null;

        if (ctx.logic().getText().equals("OR")||ctx.logic().getText().equals("or")) {
            logic=LogicFilter.Logic.OR;
        }else if(ctx.logic().getText().equals("AND")||ctx.logic().getText().equals("and")){
            logic=LogicFilter.Logic.AND;
        }
        return new LogicCond(xq1,logic,xq2);
    }

    @Override
    public XQuery visitNotCond(XQueryParser.NotCondContext ctx) {
        return new NotCond(visit(ctx.cond()));
    }


    /*
     * Function for apXp to construct the ap using ExpressionBuilder, and return all nodes
     * by its xpath
     */
    public List<Node> Search(String query, DocumentBuilder documentBuilder) throws Exception{

        List<Node> cur_position = new ArrayList<>();
        XPathLexer lexer = new XPathLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XPathParser parser = new XPathParser(tokens);
        ParserRuleContext tree = parser.ap();

        // Use the expressionBuilder to visit the ap path
        expression.AbsolutePath root = (AbsolutePath) this.expressionBuilder.visit(tree);

        //Interface for expressions
        //File inputStream = new File("j_caesar2.xml");
        //Document doc = documentBuilder.parse(inputStream);

        cur_position.add(this.document);
        //cur_position.add(doc);

        List<Node> res = root.search(cur_position);

        //System.out.println("Size is ========" + res.size());
        return res;
    }
}