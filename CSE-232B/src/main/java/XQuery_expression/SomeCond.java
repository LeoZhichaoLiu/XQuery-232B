package XQuery_expression;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class SomeCond implements XQuery{
    final boolean cond;

    public SomeCond(List<Node> cond) {
        if(cond!=null){
            this.cond = true;
        }else{
            this.cond = false;
        }
    }


    @Override
    public XQueryKind getXQueryKind() {
        return XQueryKind.SomeCond;
    }

    @Override
    public List<Node> search(Document document) throws Exception {
        if(this.cond){
            return Collections.emptyList();
        }else return null;
    }
}
