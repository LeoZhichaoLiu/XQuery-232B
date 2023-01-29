package xpath;

import com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl;
import expression.AbsolutePath;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import java.util.ArrayList;
import java.util.List;

public class XPath {

    public XPath() throws Exception{
        //using parsers libraries to build XML parse trees
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
        this.docBuilder = doc.newDocumentBuilder();
        this.docBuilder.setEntityResolver(new MyEntityResolver());
    }


    public List<Node> compare(String toString) {

        List<Node> input = new ArrayList<>();
        return input;
    }

    public void transform(List<Node> res) throws Exception{
        TransformerFactory tf=TransformerFactory.newInstance();
    }


    final private DocumentBuilder docBuilder;
}
