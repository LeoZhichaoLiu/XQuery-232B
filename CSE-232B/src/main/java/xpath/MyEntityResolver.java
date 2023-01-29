package xpath;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.InputStream;

public class MyEntityResolver implements EntityResolver {

    public InputSource resolveEntity(String pubId,String sysId) throws SAXException{
        if (sysId.contains("play.dtd")) {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream myResolver = classloader.getResourceAsStream("play.dtd");
            return new InputSource(myResolver);
        } else {
            return null;
        }
    }
}
