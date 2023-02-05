package xpath;

import expression.*;
import parsers.*;

import org.antlr.v4.runtime.*;
import org.w3c.dom.*;
import visitor.ExpressionBuilder;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Paths;

public class M1test {
    public static void main(String[] args) throws Exception{

        if(args.length != 2) {
            System.out.println("Your input size is wrong, please check it!");
            System.exit(-1);
        }

        String queryFileName = args[0];
        String outputFileName = args[1];

        String query = new String(Files.readAllBytes(Paths.get(queryFileName)), "UTF-8");
        System.out.println(query);

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder document = documentFactory.newDocumentBuilder();
        List<Node> res = Search(query, document);
        System.out.println(res.size());
        convert2XML(res, outputFileName);
    }


    public static List<Node> Search(String query, DocumentBuilder documentBuilder) throws Exception{

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

    public static void convert2XML(List<Node> result, String outputFile) throws Exception {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder document = documentFactory.newDocumentBuilder();
        Document outputDoc = document.newDocument();
        outputDoc.setXmlStandalone(true);

        Node resultTag = outputDoc.createElement("Result");
        for (Node node : result) {
            if (node != null) {
                resultTag.appendChild(outputDoc.importNode(node, true));
            }
        }
        outputDoc.appendChild(resultTag);

        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        tf.setOutputProperty(OutputKeys.STANDALONE, "yes");

        DOMSource domSource = new DOMSource(outputDoc);
        StreamResult res = new StreamResult(new FileOutputStream(outputFile));
        tf.transform(domSource, res);
    }
}