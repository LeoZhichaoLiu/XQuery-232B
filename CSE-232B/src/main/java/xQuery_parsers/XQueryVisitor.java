// Generated from java-escape by ANTLR 4.11.1

package xQuery_parsers;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XQueryParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(XQueryParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaXq(XQueryParser.CommaXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrXq(XQueryParser.StrXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionXq(XQueryParser.FunctionXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaXq(XQueryParser.ParaXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApXq(XQueryParser.ApXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinXq(XQueryParser.JoinXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXq(XQueryParser.VarXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXq(XQueryParser.LetXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlashXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashXq(XQueryParser.SlashXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagCurlyXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagCurlyXq(XQueryParser.TagCurlyXqContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(XQueryParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#attrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrList(XQueryParser.AttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#attriName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttriName(XQueryParser.AttriNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SomeCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicCond(XQueryParser.LogicCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareCond(XQueryParser.CompareCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaCond(XQueryParser.ParaCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#tagName1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName1(XQueryParser.TagName1Context ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#tagName2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName2(XQueryParser.TagName2Context ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(XQueryParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code All}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(XQueryParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaRp(XQueryParser.ParaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XQueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlashRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashRp(XQueryParser.SlashRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(XQueryParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XQueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tag}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(XQueryParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaRp(XQueryParser.CommaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicFilter(XQueryParser.LogicFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareFilter(XQueryParser.CompareFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(XQueryParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantFilter(XQueryParser.ConstantFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaFilter(XQueryParser.ParaFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#slash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlash(XQueryParser.SlashContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#docName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(XQueryParser.AttrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(XQueryParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(XQueryParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XQueryParser.DocContext ctx);
}