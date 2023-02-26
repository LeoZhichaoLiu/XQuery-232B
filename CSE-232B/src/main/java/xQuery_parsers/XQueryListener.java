// Generated from java-escape by ANTLR 4.11.1

package xQuery_parsers;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code CommaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterCommaXq(XQueryParser.CommaXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitCommaXq(XQueryParser.CommaXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFunctionXq(XQueryParser.FunctionXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFunctionXq(XQueryParser.FunctionXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStrXq(XQueryParser.StrXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStrXq(XQueryParser.StrXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterParaXq(XQueryParser.ParaXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitParaXq(XQueryParser.ParaXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXq(XQueryParser.ApXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXq(XQueryParser.ApXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXq(XQueryParser.VarXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXq(XQueryParser.VarXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXq(XQueryParser.LetXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXq(XQueryParser.LetXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlashXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterSlashXq(XQueryParser.SlashXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlashXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitSlashXq(XQueryParser.SlashXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagCurlyXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagCurlyXq(XQueryParser.TagCurlyXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagCurlyXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagCurlyXq(XQueryParser.TagCurlyXqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SomeCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SomeCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterLogicCond(XQueryParser.LogicCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitLogicCond(XQueryParser.LogicCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCompareCond(XQueryParser.CompareCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCompareCond(XQueryParser.CompareCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParaCond(XQueryParser.ParaCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParaCond(XQueryParser.ParaCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName1}.
	 * @param ctx the parse tree
	 */
	void enterTagName1(XQueryParser.TagName1Context ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName1}.
	 * @param ctx the parse tree
	 */
	void exitTagName1(XQueryParser.TagName1Context ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName2}.
	 * @param ctx the parse tree
	 */
	void enterTagName2(XQueryParser.TagName2Context ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName2}.
	 * @param ctx the parse tree
	 */
	void exitTagName2(XQueryParser.TagName2Context ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XQueryParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XQueryParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code All}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAll(XQueryParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code All}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAll(XQueryParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParaRp(XQueryParser.ParaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParaRp(XQueryParser.ParaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XQueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XQueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlashRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSlashRp(XQueryParser.SlashRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlashRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSlashRp(XQueryParser.SlashRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XQueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XQueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTag(XQueryParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTag(XQueryParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCommaRp(XQueryParser.CommaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCommaRp(XQueryParser.CommaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterLogicFilter(XQueryParser.LogicFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitLogicFilter(XQueryParser.LogicFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterCompareFilter(XQueryParser.CompareFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitCompareFilter(XQueryParser.CompareFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterConstantFilter(XQueryParser.ConstantFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitConstantFilter(XQueryParser.ConstantFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterParaFilter(XQueryParser.ParaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitParaFilter(XQueryParser.ParaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#slash}.
	 * @param ctx the parse tree
	 */
	void enterSlash(XQueryParser.SlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#slash}.
	 * @param ctx the parse tree
	 */
	void exitSlash(XQueryParser.SlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#docName}.
	 * @param ctx the parse tree
	 */
	void enterDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#docName}.
	 * @param ctx the parse tree
	 */
	void exitDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(XQueryParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(XQueryParser.AttrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(XQueryParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(XQueryParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(XQueryParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(XQueryParser.LogicContext ctx);
}