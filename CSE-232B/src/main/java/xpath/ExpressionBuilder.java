package xpath;

import parsers.*;
import expression.*;


public class ExpressionBuilder extends XPathBaseVisitor<Expression> {

    // Absolute Path
    @Override
    public Expression visitAp(XPathParser.ApContext ctx) {


    }

    // Relative Path
    @Override
    public Expression visitTag(XPathParser.TagContext ctx) {


    }

    @Override
    public Expression visitAll(XPathParser.AllContext ctx) {


    }

    @Override
    public Expression visitCurrent(XPathParser.CurrentContext ctx) {


    }

    @Override
    public Expression visitParent(XPathParser.ParentContext ctx) {


    }

    @Override
    public Expression visitText(XPathParser.TextContext ctx) {


    }

    @Override
    public Expression visitAttribute(XPathParser.AttributeContext ctx) {


    }

    @Override
    public Expression visitParaRp(XPathParser.ParaRpContext ctx) {


    }

    @Override
    public Expression visitSlashRp(XPathParser.SlashRpContext ctx) {


    }

    @Override
    public Expression visitFilterRp(XPathParser.FilterRpContext ctx) {


    }

    @Override
    public Expression visitCommaRp(XPathParser.CommaRpContext ctx) {


    }

    // Filter
    @Override
    public Expression visitRpFilter(XPathParser.RpFilterContext ctx) {


    }

    @Override
    public Expression visitCompareFilter(XPathParser.CompareFilterContext ctx) {


    }

    @Override
    public Expression visitConstantFilter(XPathParser.ConstantFilterContext ctx) {


    }

    @Override
    public Expression visitParaFilter(XPathParser.ParaFilterContext ctx) {


    }

    @Override
    public Expression visitLogicFilter(XPathParser.LogicFilterContext ctx) {


    }

    @Override
    public Expression visitNotFilter(XPathParser.NotFilterContext ctx) {


    }


}
