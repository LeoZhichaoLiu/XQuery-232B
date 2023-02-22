package XQuery;

import expression.*;
import parsers.*;
import XQuery_expression.*;
import xQuery_parsers.*;

import org.antlr.v4.runtime.*;
import org.w3c.dom.*;
import visitor.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Paths;

public class M2test {

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

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XQueryParser parser = new XQueryParser(tokens);
        // Get the xq tree of the whole Xquery string, using parser
        ParserRuleContext tree = parser.xq();

        Document document = documentBuilder.newDocument();
        // Create the new XQueryBuilder object, and start to visit xq tree (get xq root)
        XQueryBuilder xqueryBuilder = new XQueryBuilder(document);
        // Visit the whole tree (functionXp), it will return root that save the result list
        XQuery root =  xqueryBuilder.visit(tree);

        // Use function search to return all the return nodes
        return root.search(document);
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
        tf.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

        DOMSource domSource = new DOMSource(outputDoc);
        StreamResult res = new StreamResult(new FileOutputStream(outputFile));
        tf.transform(domSource, res);
    }

}
