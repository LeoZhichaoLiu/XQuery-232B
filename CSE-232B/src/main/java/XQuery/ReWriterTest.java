package XQuery;

import XQuery_expression.JointOptimizationRewriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReWriterTest {

    public static void main(String[] args) throws Exception {
        String originalQuery = "query.txt";
//        String outputFileName = "tests/milestone3/output.txt";

        String query = new String(Files.readAllBytes(Paths.get(originalQuery)), "UTF-8");
        System.out.println(query);

        String rewritten = JointOptimizationRewriter.rewriter(query);
        System.out.print(rewritten);
    }
}
