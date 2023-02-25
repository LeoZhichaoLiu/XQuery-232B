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

    public XQueryBuilder (Document document) throws Exception {
        this.map = new HashMap<>();
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

        // For letXq xQuery, we first visit its letClause to update map, then return xq
        visit(ctx.letClause());
        XQuery res = visit(ctx.xq());

        // We need to return to original map after
        map = restore;
        return res;
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
                if (condition_list == null || condition_list.size() == 0) {
                    return;
                }
            }

            // Based on return clause, use search to get all answer nodes, add to res list
            List<Node> return_list = visit(ctx.returnClause().xq()).search(document);
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
    public XQuery visitForClause(XQueryParser.ForClauseContext ctx) {
        return visitChildren(ctx);
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
    public XQuery visitWhereClause(XQueryParser.WhereClauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public XQuery visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public XQuery visitCompareCond(XQueryParser.CompareCondContext ctx){
        XQuery rp1=visit(ctx.xq(0));
        XQuery rp2=visit(ctx.xq(1));
        DoubleFilter.Compare comp=null;

        if (ctx.comp().getText().equals("=")) {
            comp = DoubleFilter.Compare.EQ_N;

        } else if (ctx.comp().getText().equals("eq")) {
            comp = DoubleFilter.Compare.EQ;

        } else if (ctx.comp().getText().equals("==")) {
            comp = DoubleFilter.Compare.IS_N;

        } else if (ctx.comp().getText().equals("is")) {
            comp = DoubleFilter.Compare.IS;
        }

        return new CompareCond(rp1,comp,rp2);
    }

    @Override
    public XQuery visitEmptyCond(XQueryParser.EmptyCondContext ctx){
        return new EmptyCond(visit(ctx.xq()));
    }

    @Override
    public XQuery visitSomeCond(XQueryParser.SomeCondContext ctx){
        XQuery finalCond=visit(ctx.cond());
        XQuery condQuery=null;

        List<XQueryParser.XqContext>  queryList = ctx.xq();
        List<TerminalNode> varList=ctx.Var();

        if(varList==null||queryList==null||queryList.size()!=varList.size()){
            throw new IllegalArgumentException();
        }

        for(int i=0;i<varList.size();i++){
            try{
                List<Node> values=visit(queryList.get(i)).search(document);
                String name=varList.get(i).getText();
                map.put(name,values);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try{
            condQuery=new SomeCond(finalCond.search(document));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return condQuery;
    }

    @Override
    public XQuery visitParaCond(XQueryParser.ParaCondContext ctx){
        return new ParaCond(visit(ctx.xq()));
    }

    @Override
    public XQuery visitLogicCond(XQueryParser.LogicCondContext ctx){
        XQuery rp1=visit(ctx.xq(0));
        XQuery rp2=visit(ctx.xq(1));
        LogicFilter.Logic logic=null;

        if (ctx.logic().getText().equals("OR")||ctx.logic().getText().equals("or")) {
            logic=LogicFilter.Logic.OR;
        }else if(ctx.logic().getText().equals("AND")||ctx.logic().getText().equals("and")){
            logic=LogicFilter.Logic.AND;
        }
        return new LogicCond(rp1,logic,rp2);
    }

    @Override
    public XQuery visitNotCond(XQueryParser.NotCondContext ctx) {
        return new NotCond(visit(ctx.xq()));
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
        File inputStream = new File(root.returnDoc());
        Document doc = documentBuilder.parse(inputStream);

        //System.out.println(doc.getDocumentElement().getNodeName());
        cur_position.add(doc);
        return root.search(cur_position);
    }
}