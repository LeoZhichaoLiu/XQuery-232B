package visitor;

import parsers.*;
import expression.*;


public class ExpressionBuilder extends XPathBaseVisitor<Expression> {

    // Absolute Path
    @Override
    public Expression visitAp(XPathParser.ApContext ctx) {
        String docName = ctx.docName().NAME().getText();
        AbsolutePath.Slash slash = null;
        Expression rp = visit(ctx.rp());

        if (ctx.slash().getText().equals("/")) {
            slash = AbsolutePath.Slash.SSLASH;
        } else if (ctx.slash().getText().equals("//")) {
            slash = AbsolutePath.Slash.DSLASH;
        }

        return new AbsolutePath(docName.substring(1, docName.length()-1), slash, rp);
    }

    // Relative Path
    @Override
    public Expression visitTag(XPathParser.TagContext ctx) {

        return new AttTagRp(AttTagRp.Type.Tag, ctx.tagName().getText());
    }

    @Override
    public Expression visitAll(XPathParser.AllContext ctx) {

        return new SingleRp(SingleRp.Value.ALL);
    }

    @Override
    public Expression visitCurrent(XPathParser.CurrentContext ctx) {

        return new SingleRp(SingleRp.Value.CURRENT);
    }

    @Override
    public Expression visitParent(XPathParser.ParentContext ctx) {

        return new SingleRp(SingleRp.Value.PARENT);
    }

    @Override
    public Expression visitText(XPathParser.TextContext ctx) {

        return new SingleRp(SingleRp.Value.TEXT);
    }

    @Override
    public Expression visitAttribute(XPathParser.AttributeContext ctx) {

        return new AttTagRp(AttTagRp.Type.Attribute, ctx.attrName().ID().getText());
    }

    @Override
    public Expression visitParaRp(XPathParser.ParaRpContext ctx) {

        return new ParameterRp(visit(ctx.rp()));
    }

    @Override
    public Expression visitSlashRp(XPathParser.SlashRpContext ctx) {

        Expression rp1 = visit(ctx.rp(0));
        DoubleRp.Operator slash = null;
        Expression rp2 = visit(ctx.rp(1));

        if (ctx.slash().getText().equals("/")) {
            slash = DoubleRp.Operator.SSLASH;
        } else if (ctx.slash().getText().equals("//")) {
            slash = DoubleRp.Operator.DSLASH;
        }

        return new DoubleRp(rp1, slash, rp2);
    }

    @Override
    public Expression visitFilterRp(XPathParser.FilterRpContext ctx) {

        Expression rp = visit(ctx.rp());
        Expression f = visit(ctx.f());

        return new FilterRp(rp, f);
    }

    @Override
    public Expression visitCommaRp(XPathParser.CommaRpContext ctx) {

        Expression rp1 = visit(ctx.rp(0));
        Expression rp2 = visit(ctx.rp(1));
        return new DoubleRp(rp1, DoubleRp.Operator.COMMA, rp2);
    }

    // Filter
    @Override
    public Expression visitRpFilter(XPathParser.RpFilterContext ctx) {

        return new SingleFilter(visit(ctx.rp()));
    }

    @Override
    public Expression visitCompareFilter(XPathParser.CompareFilterContext ctx) {
        Expression rp1 = visit(ctx.rp(0));
        DoubleFilter.Compare comp = null;
        Expression rp2 = visit(ctx.rp(1));

        if (ctx.comp().getText().equals("=")) {
            comp = DoubleFilter.Compare.EQ_N;

        } else if (ctx.comp().getText().equals("eq")) {
            comp = DoubleFilter.Compare.EQ;

        } else if (ctx.comp().getText().equals("==")) {
            comp = DoubleFilter.Compare.IS_N;

        } else if (ctx.comp().getText().equals("is")) {
            comp = DoubleFilter.Compare.IS;
        }

        return new DoubleFilter(rp1, comp, rp2);
    }

    @Override
    public Expression visitConstantFilter(XPathParser.ConstantFilterContext ctx) {

        Expression rp = visit(ctx.rp());
        String constant = ctx.stringConstant().getText();

        return new ConstantFilter(rp, constant);
    }

    @Override
    public Expression visitParaFilter(XPathParser.ParaFilterContext ctx) {

        return new ParameterFilter(visit(ctx.f()));
    }

    @Override
    public Expression visitLogicFilter(XPathParser.LogicFilterContext ctx) {

        Expression f1 = visit(ctx.f(0));
        LogicFilter.Logic logic = null;
        Expression f2 = visit(ctx.f(1));

        if (ctx.logic().getText().equals("and")) {

            logic = LogicFilter.Logic.AND;

        } else if (ctx.logic().getText().equals("or")) {

            logic = LogicFilter.Logic.OR;
        }

        return new LogicFilter(f1, logic, f2);
    }

    @Override
    public Expression visitNotFilter(XPathParser.NotFilterContext ctx) {

        return new NotFilter(visit(ctx.f()));
    }
}
