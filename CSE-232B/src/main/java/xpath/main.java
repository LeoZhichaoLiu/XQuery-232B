package xpath;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception{
        if(args.length==0){
            System.out.println("Please input query file!");
            System.exit(1);
        }

        String filePath=args[0];
        try{
            BufferedReader input=new BufferedReader(new FileReader(filePath));
            StringBuilder query=new StringBuilder();
            String str;
            while((str=input.readLine())!=null){
                query.append(str.replaceAll("\r\n|\r|\n", " "));
                query.append(" ");
            }

            XPath xpath=new XPath();

            List<Node> res=xpath.compare(query.toString());
            xpath.transform(res);}catch (IOException e) {
            System.err.println("Cannot read the file:" + filePath);
            System.exit(-1);
        }
    }
}
