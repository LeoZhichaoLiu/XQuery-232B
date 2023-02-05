package expression;

import java.util.*;
import org.w3c.dom.Node;

public class AbsolutePath implements Expression {

    public enum Slash {
        SSLASH,
        DSLASH
    }

    final String doc;
    final Slash slash;
    final Expression rp;

    public AbsolutePath(String doc, Slash s, Expression rp) {

        this.doc = doc;
        this.slash = s;
        this.rp = rp;
    }

    public String returnDoc(){
        return this.doc+".xml";
    }

    @Override
    public List<Node> search (List<Node> input) throws Exception{

        List<Node> res;
//        System.out.println(111);

        if (slash == Slash.SSLASH) {
            res = rp.search(input);
//            System.out.println(333);
        } else if (slash == Slash.DSLASH){
//            System.out.println(444);
            List<Node> descendant = searchDescendant(input);
//            System.out.println(descendant);
            res = rp.search(descendant);

        } else {
            throw new Exception("Operator has issue");
        }

        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AbsolutePath that = (AbsolutePath) o;
        return Objects.equals(doc, that.doc) && slash == that.slash && Objects.equals(rp, that.rp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doc, slash, rp);
    }

    @Override
    public String toString() {
        final StringBuilder str = new StringBuilder();
        str.append(this.doc);
        str.append(this.slash.toString());
        str.append(this.rp.toString());
        return str.toString();
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.ap;
    }
}