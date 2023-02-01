package xpath;

import expression.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Attr;
import org.w3c.dom.Text;
import parsers.XPathLexer;
import parsers.XPathParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M1test {
    public static void main(String[] args) throws Exception{

        if(args.length!=1) {
            System.out.println("Please input the both XML file path and the query file path!");
            System.out.println(args[0]);
            System.exit(-1);
        }
        //String query=obtainQuery(args[0]);
        String query = args[0];
        System.out.println("hhh");
        DocumentBuilder dbr=buildDocument();
        List<Node> res=compare(query,dbr);
        System.out.println(res.size());
        transform(res);
    }

    public static DocumentBuilder buildDocument() throws ParserConfigurationException {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        DocumentBuilder db=dbf.newDocumentBuilder();
        //db.setEntityResolver(new MyEntityResolver());
        return db;
    }

    public static String obtainQuery(String filePath) throws IOException {
        StringBuilder query= new StringBuilder();
        BufferedReader file=new BufferedReader(new FileReader(filePath));
        String str;
        while ((str = file.readLine())!=null) {
            query.append(str.replaceAll("\r\n|\r|\n", " "));
            query.append(" ");
        }
        return query.toString();
    }

    public static XPathParser pathParser(String path)  {
        final XPathLexer lexer = new XPathLexer(CharStreams.fromString(path));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new XPathParser(tokens);
    }

    public static List<Node> compare(String query,DocumentBuilder dbr) throws Exception{

        final ParserRuleContext tree = pathParser(query).ap();
        final ExpressionBuilder expBuild = new ExpressionBuilder();
        final Expression rootExp = expBuild.visit(tree);

        //Interface for expressions
        AbsolutePath absoluteExpression = (AbsolutePath)rootExp;
        //ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        System.out.println(absoluteExpression.returnDoc());
        File is = new File(absoluteExpression.returnDoc());

        //InputStream is = classloader.getResourceAsStream(absoluteExpression.returnDoc());
        Document doc = dbr.parse(is);

        System.out.println(doc.getDocumentElement().getNodeName());

        List<Node> inputNodes = new ArrayList<>();
        inputNodes.add(doc);
        return absoluteExpression.search(inputNodes);
    }

    public static void transform(List<Node> result) throws Exception{
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        for (Node n: result) {
            if(n instanceof Attr) {
                System.out.println(n.getTextContent());
            } else if (n instanceof Text) {
                System.out.println(n.getTextContent());
            } else {
                tf.transform(new DOMSource(n), new StreamResult(
                        new PrintStream(System.out)));
            }
        }
    }

}