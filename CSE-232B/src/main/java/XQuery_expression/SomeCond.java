package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class SomeCond implements XQuery{

    boolean isSatisified;

    public SomeCond(boolean isSatisified) {
        //System.out.println(isSatisified);
        this.isSatisified = isSatisified;
    }


    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.SomeCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        //System.out.println(isSatisified);
        if (this.isSatisified){
            return Collections.emptyList();
        }

        return null;
    }
}
