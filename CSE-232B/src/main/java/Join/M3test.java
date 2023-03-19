package Join;

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

public class M3test {

    public static void main(String[] args) throws Exception{

        if(args.length != 2) {
            System.out.println("Your input size is wrong, please check it!");
            System.exit(-1);
        }

        String queryFileName = args[0];
        String outputFileName = args[1];

        String query = new String(Files.readAllBytes(Paths.get(queryFileName)), "UTF-8");
        System.out.println(query);
        System.out.println();

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder document = documentFactory.newDocumentBuilder();

        //String join_query = JoinRewrite(query, document);
        //System.out.println (join_query);
        long start = System.currentTimeMillis();
        List<Node> res = Search(query, document);
        long end = System.currentTimeMillis();

        System.out.println("Duration time for query is: " + (end-start));

        convert2XML(res, outputFileName);
    }

    public static String JoinRewrite (String query, DocumentBuilder documentBuilder) throws Exception {

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XQueryParser parser = new XQueryParser(tokens);
        ParserRuleContext tree = parser.xq();

        JoinOptimization joinModifier = new JoinOptimization();
        String join_query = joinModifier.rewrite((XQueryParser.FunctionXqContext) tree);

        return join_query;
    }

    public static List<Node> Search(String query, DocumentBuilder documentBuilder) throws Exception{

        XQueryLexer lexer = new XQueryLexer(CharStreams.fromString(query));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XQueryParser parser = new XQueryParser(tokens);
        ParserRuleContext tree = parser.xq();

        Document temp_document = documentBuilder.newDocument();
        XQueryBuilder temp_xqueryBuilder = new XQueryBuilder(temp_document);
        XQuery temp_root = temp_xqueryBuilder.visit(tree);

        String fileName = temp_root.getDocName();
        System.out.println(fileName);
        if (fileName == null) {
            fileName = "j_caesar_M3.xml";
        }

        File inputStream = new File(fileName);
        Document document = documentBuilder.parse(inputStream);

        XQueryBuilder xqueryBuilder = new XQueryBuilder(document);

        XQuery root = xqueryBuilder.visit(tree);

        return root.search(document);
    }

    public static void convert2XML(List<Node> result, String outputFile) throws Exception {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder document = documentFactory.newDocumentBuilder();
        Document outputDoc = document.newDocument();
        //outputDoc.setXmlStandalone(true);

        if (result.size() == 1) {
            outputDoc.appendChild(outputDoc.importNode(result.get(0), true));

        } else if (result.size() != 0){
            Node resultTag = outputDoc.createElement("result");
            for (Node node : result) {
                if (node != null) {
                    resultTag.appendChild(outputDoc.importNode(node, true));
                }
            }
            outputDoc.appendChild(resultTag);
        }

        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        //tf.setOutputProperty(OutputKeys.STANDALONE, "yes");

        DOMSource domSource = new DOMSource(outputDoc);
        StreamResult res = new StreamResult(new FileOutputStream(outputFile));
        tf.transform(domSource, res);
    }

}

