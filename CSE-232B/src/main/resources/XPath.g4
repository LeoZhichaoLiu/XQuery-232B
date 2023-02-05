grammar XPath;

@header {
package cse232b.parsers;
}

/* Rules */
ap: docName slash rp;

rp: tagName #Tag | STAR #All | CURRENT #Current | PARENT #Parent | TEXT #Text
    | attrName #Attribute
    | LPR rp RPR #ParaRp
    | rp slash rp #SlashRp
    | rp LSB f RSB #FilterRp
    | rp COMMA rp #CommaRp;

f:  rp #RpFilter
    | rp comp rp #CompareFilter
    |rp EQ_N stringConstant #ConstantFilter
    | LPR f RPR #ParaFilter
    | f logic f #LogicFilter
    | NOT f #NotFilter;

/* Define term */
slash: SSLASH | DSLASH;
docName: DOC LPR '"' ID '.xml"' RPR;

tagName: ID;
attrName: AT ID;
comp: EQ | EQ_N | IS | IS_N;
logic: AND | OR;

stringConstant: '"' ID '"';

DOC: [dD][oO][cC];

/*Tokens*/
LPR: '(';
RPR: ')';
LSB: '[';
RSB: ']';

SSLASH: '/';
DSLASH: '//';
CURRENT: '.';
PARENT: '..';

STAR: '*';
COMMA: ',';

NOT: 'not';
AND: 'and';
OR: 'or';

EQ_N: '=';
EQ: 'eq';
IS_N: '==';
IS: 'is';

TEXT: 'text()';
AT: '@';

ID: [a-zA-Z][a-zA-Z_0-9]*;
WS: [ \t\n\r]+ -> skip;