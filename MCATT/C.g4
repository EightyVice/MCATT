/*
    Subset of C Grammar for MCATT
    Author: 8yvice
 */

grammar C;

prog
    : init+
    ;

init
    : statement
    | declaration
    ;

declaration
    : primitiveDecl             #DeclPrimitive
    | structDecl                #DeclStruct
    ;

primitiveDecl
    : type declarators ';'                                                      #DeclPrimitiveVar
    | identifier declarators ';'                                                #DeclReference
    //| identifier pointer? identifier (identifier',')* ';'                       #DeclStructRecord
    ; 

memberDecl
    : type pointer? identifier ';'
    | identifier pointer? identifier ';'
    ;

structDecl
    : 'struct' identifier '{' memberDecl+ '}'
    ;

type
    : primitiveTypes
    ;

funcCall
    : identifier '(' expressionList? ')'
    ;

primitiveTypes
    : signedorunsigned? arithType
    ;

arithType
    : 'char'
    | 'short'
    | 'int'
    | 'long'
    | 'float'
    | 'double'
    ;

arithTypeNOINT
    : 'char'
    | 'short'
    | 'long'
    ;    
signedorunsigned
    : ('signed' | 'unsgined')
    ;

declarators
    : declarator (',' declarator)*   
    ;


declarator
    : declId ('=' initializer)?
    ;

declId
    : pointer? identifier arrBracket?
    ;
    
arrBracket
    :  '[' integerLiteral* ']'
    ;
pointer
    : '*'
    ;

expression
    : primary                                                                       #ExprPrimary
    | identifier                                                                    #ExprIdentifier
    | '(' expression ')'                                                            #ExprGroupedExpression
    | expression bop='.' identifier                                                 #ExprMemberAcess
    | funcCall                                                                      #ExprFuncCall
    | 'new' identifier '(' ')'                                                      #ExprConstructor
    | expression postfix=('++' | '--')                                              #ExprPostfix    
    | prefix=('+'|'-'|'++'|'--') expression                                         #ExprPrefixArthemtic
    | prefix=('~'|'!') expression                                                   #ExprPrefixLogical
    | prefix=('*' | '&') expression                                                 #ExprIndirection
    | expression bop=('*'|'/'|'%') expression                                       #ExprMDM
    | expression bop=('+'|'-') expression                                           #ExprAS
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression                       #ExprShifting
    | expression bop=('<=' | '>=' | '>' | '<') expression                           #ExprComparison
    | expression bop=('==' | '!=') expression                                       #ExprEquality
    | expression bop='&' expression                                                 #ExprBitwiseAND
    | expression bop='^' expression                                                 #ExprXOR
    | expression bop='|' expression                                                 #ExprBitwiseOR
    | expression bop='&&' expression                                                #ExprLogicalAND
    | expression bop='||' expression                                                #ExprLogicalOR
    | <assoc=right> expression bop='?' expression ':' expression                    #ExprTernary
    | <assoc=right> expression 
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>=' | '<<=' | '%=')
      expression                                                                    #ExprRightAssociation
    ;

initializer
    : expression
    | arrayInit
    ;

arrayInit
    : '{' (initializer (',' initializer)* (',')? )? '}'
    ;

statement
    : 'if'  exprpar statement ('else' statement)?           #StmtIf
    | 'while' exprpar statement                             #StmtWhile
    | 'do' statement 'while' exprpar ';'                    #StmtDoWhile
    | 'return' expression? ';'                              #StmtReturn
    //| 'for' '(' forControl ')' statement
    | statementExpression=expression ';'                    #StmtExpression
    | ';'                                                   #EmptyStatement
    ;


exprpar
    : '(' expression ')'
    ;

primary
    : literal                   #PrimaryLiteral
    | identifier                #PrimaryIdentifier
    ;


identifier
    : IDENTIFIER
    ;

literal
    : integerLiteral
    | floatLiteral
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;    
    

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;





expressionList
    : expression (',' expression)*
    ;


/*
    ======================
        LEXER RULES
    ======================    
 */


DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
OCT_LITERAL:        '0' '_'* [0-7] ([0-7_]* [0-7])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;

FLOAT_LITERAL:      (Digits '.' Digits? | '.' Digits) ExponentPart? [fFdD]?
             |       Digits (ExponentPart [fFdD]? | [fFdD])
             ;

HEX_FLOAT_LITERAL:  '0' [xX] (HexDigits '.'? | HexDigits? '.' HexDigits) [pP] [+-]? Digits [fFdD]?;

BOOL_LITERAL:       'true'
            |       'false'
            ;

CHAR_LITERAL:       '\'' (~['\\\r\n] | EscapeSequence) '\'';

STRING_LITERAL:     '"' (~["\\\r\n] | EscapeSequence)* '"';

IDENTIFIER: 
    Letter LetterOrDigit*;

fragment ExponentPart
    : [eE] [+-]? Digits
    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;

fragment LetterOrDigit
    : Letter
    | [0-9]
    ;

fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;