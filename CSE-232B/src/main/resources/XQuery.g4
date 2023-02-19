grammar XQuery;
import XPath;

@header {
package xQuery_parsers;
}

/* Rules */
xq: Var #VarXq | stringConstant #StrXq | ap #ApXq
    | LPR Var RPR #ParaXq | xq COMMA xq #CommaXq | xq slash rp #SlashXq
    | LTag tagName1 RTag LCurly xq RCurly LTag tagName2 RTag #TagCurlyXq
    | forClause letClause whereClause returnClause #FunctionXq
    | letClause xq #LetXq;

forClause: For Var In xq (COMMA For Var In xq)*;

letClause: Let Var Assign xq (COMMA Let Var Assign xq)*;

whereClause: Where cond;

returnClause: Return xq;

cond: xq comp xq #CompareCond
      | Empty LPR xq RPR #EmptyCond
      | Some Var In xq (COMMA Var In xq)* Satisfies cond #SomeCond
      | LPR xq RPR #ParaCond
      | xq logic xq #LogicCond
      | NOT xq #NotCond;

tagName1: tagName;
tagName2: tagName;

/*Tokens*/
Var: '$' ID;
LTag: '<';
RTag: '>';
LCurly: '{';
RCurly: '}';
For: 'for';
Let: 'let';
Where: 'where';
Return: 'return';
In: 'in';
Empty: 'empty';
Some: 'some';
Satisfies: 'satisfies';
Assign: ':=';

