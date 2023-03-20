grammar XQuery;
import XPath;

@header {
package xQuery_parsers;
}

parse: xq+;

/* Rules */
xq: Var #VarXq | stringConstant #StrXq | ap #ApXq
    | LPR xq RPR #ParaXq | xq slash rp #SlashXq | xq COMMA xq #CommaXq
    | LTag tagName1 RTag LCurly xq RCurly LTag SSLASH tagName2 RTag #TagCurlyXq
    | forClause (letClause)? (whereClause)? returnClause #FunctionXq
    | letClause xq #LetXq
    | joinClause #JoinXq;

/* new definition for join clause */
joinClause: 'join' LPR xq COMMA xq COMMA attrList COMMA attrList RPR;

attrList: LSB attriName (COMMA attriName)* RSB;

attriName: ID;

forClause: For Var In xq (COMMA Var In xq)*;

letClause: Let Var Assign xq (COMMA Var Assign xq)*;

whereClause: Where cond;

returnClause: Return xq;

cond: xq comp xq #CompareCond
      | Empty LPR xq RPR #EmptyCond
      | Some Var In xq (COMMA Var In xq)* Satisfies cond #SomeCond
      | LPR cond RPR #ParaCond
      | cond logic cond #LogicCond
      | NOT cond #NotCond;

tagName1: tagName;
tagName2: tagName;

/*Tokens*/
stringConstant: STRING;
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

STRING
:
   '"'
   (
      ESCAPE
      | ~["\\]
   )* '"'
   | '\''
   (
      ESCAPE
      | ~['\\]
   )* '\''
;

ESCAPE
:
   '\\'
   (
      ['"\\]
   )
;