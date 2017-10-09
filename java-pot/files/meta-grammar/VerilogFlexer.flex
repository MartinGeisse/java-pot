package name.martingeisse.testplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import name.martingeisse.testplugin.parser.VerilogElementTypes;

%%

%class VerilogFlexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%public

WHITESPACE=[\ \n\r\t\f]
SIGNED_NUMBER=[+-]?[0-9]+
SIGNED_LITERAL=[+-]?[0-9xz]+
UNSIGNED_NUMBER=[0-9]+
UNSIGNED_LITERAL=[0-9xz]+

%xstate BLOCK_COMMENT

%%

// preprocessor
// \`.*\n { return VerilogElementTypes.V_TOKEN_PREPROCESSOR_DIRECTIVE; }

// whitespace and comments
{WHITESPACE}+ { return TokenType.WHITE_SPACE; }
"//".* { }
"/*" { yybegin(BLOCK_COMMENT); }
<BLOCK_COMMENT>"*/" { yybegin(YYINITIAL); }
<BLOCK_COMMENT>[^] { }

// puctuation
\. { return VerilogElementTypes.V_TOKEN_DOT; }
\: { return VerilogElementTypes.V_TOKEN_COLON; }
\; { return VerilogElementTypes.V_TOKEN_SEMICOLON; }
\, { return VerilogElementTypes.V_TOKEN_COMMA; }
\( { return VerilogElementTypes.V_TOKEN_OPENING_PARENTHESIS; }
\) { return VerilogElementTypes.V_TOKEN_CLOSING_PARENTHESIS; }
\[ { return VerilogElementTypes.V_TOKEN_OPENING_BRACKET; }
\] { return VerilogElementTypes.V_TOKEN_CLOSING_BRACKET; }
\# { return VerilogElementTypes.V_TOKEN_HASH; }
\= { return VerilogElementTypes.V_TOKEN_EQUALS; }
\<\= { return VerilogElementTypes.V_TOKEN_ARROW_ASSIGN; }
\-\> { return VerilogElementTypes.V_TOKEN_EVENT_ARROW; }
\*\> { return VerilogElementTypes.V_TOKEN_ASTERISK_GREATER_THAN; }
\&\&\& { return VerilogElementTypes.V_TOKEN_TRIPLE_AMPERSAND; }
\{ { return VerilogElementTypes.V_TOKEN_OPENING_BRACE; }
\} { return VerilogElementTypes.V_TOKEN_CLOSING_BRACE; }
\@ { return VerilogElementTypes.V_TOKEN_AT; }

// bitwise operators
\~ { return VerilogElementTypes.V_TOKEN_OP_BITWISE_NOT; }
\& { return VerilogElementTypes.V_TOKEN_OP_BITWISE_AND; }
\| { return VerilogElementTypes.V_TOKEN_OP_BITWISE_OR; }
\^ { return VerilogElementTypes.V_TOKEN_OP_BITWISE_XOR; }
\~\& { return VerilogElementTypes.V_TOKEN_OP_BITWISE_NAND; }
\~\| { return VerilogElementTypes.V_TOKEN_OP_BITWISE_NOR; }
\~\^ { return VerilogElementTypes.V_TOKEN_OP_BITWISE_XNOR; }
\^\~ { return VerilogElementTypes.V_TOKEN_OP_BITWISE_XNOR; }
\<\< { return VerilogElementTypes.V_TOKEN_OP_SHIFT_LEFT; }
\>\> { return VerilogElementTypes.V_TOKEN_OP_SHIFT_RIGHT; }

// logical operators
\! { return VerilogElementTypes.V_TOKEN_OP_LOGICAL_NOT; }
\&\& { return VerilogElementTypes.V_TOKEN_OP_LOGICAL_AND; }
\|\| { return VerilogElementTypes.V_TOKEN_OP_LOGICAL_OR; }

// arithmetic operators
\+ { return VerilogElementTypes.V_TOKEN_OP_PLUS; }
\- { return VerilogElementTypes.V_TOKEN_OP_MINUS; }
\* { return VerilogElementTypes.V_TOKEN_OP_TIMES; }
\/ { return VerilogElementTypes.V_TOKEN_OP_DIVIDED_BY; }
\% { return VerilogElementTypes.V_TOKEN_OP_REMAINDER; }

// comparison operators
\=\= { return VerilogElementTypes.V_TOKEN_OP_DOUBLE_EQUALS; }
\!\= { return VerilogElementTypes.V_TOKEN_OP_NOT_DOUBLE_EQUALS; }
\=\=\= { return VerilogElementTypes.V_TOKEN_OP_TRIPLE_EQUALS; }
\!\=\= { return VerilogElementTypes.V_TOKEN_OP_NOT_TRIPLE_EQUALS; }
\> { return VerilogElementTypes.V_TOKEN_OP_GREATER_THAN; }
\>\= { return VerilogElementTypes.V_TOKEN_OP_GREATER_THAN_OR_EQUALS; }
\< { return VerilogElementTypes.V_TOKEN_OP_LESS_THAN; }
\<\= { return VerilogElementTypes.V_TOKEN_OP_LESS_THAN_OR_EQUALS; }

// keywords
always { return VerilogElementTypes.V_TOKEN_KW_ALWAYS; }
and { return VerilogElementTypes.V_TOKEN_KW_AND; }
assign { return VerilogElementTypes.V_TOKEN_KW_ASSIGN; }
automatic { return VerilogElementTypes.V_TOKEN_KW_AUTOMATIC; }
begin { return VerilogElementTypes.V_TOKEN_KW_BEGIN; }
buf { return VerilogElementTypes.V_TOKEN_KW_BUF; }
bufif0 { return VerilogElementTypes.V_TOKEN_KW_BUFIF0; }
bufif1 { return VerilogElementTypes.V_TOKEN_KW_BUFIF1; }
case { return VerilogElementTypes.V_TOKEN_KW_CASE; }
casex { return VerilogElementTypes.V_TOKEN_KW_CASEX; }
casez { return VerilogElementTypes.V_TOKEN_KW_CASEZ; }
cell { return VerilogElementTypes.V_TOKEN_KW_CELL; }
cmos { return VerilogElementTypes.V_TOKEN_KW_CMOS; }
config { return VerilogElementTypes.V_TOKEN_KW_CONFIG; }
deassign { return VerilogElementTypes.V_TOKEN_KW_DEASSIGN; }
default { return VerilogElementTypes.V_TOKEN_KW_DEFAULT; }
defparam { return VerilogElementTypes.V_TOKEN_KW_DEFPARAM; }
disable { return VerilogElementTypes.V_TOKEN_KW_DISABLE; }
edge { return VerilogElementTypes.V_TOKEN_KW_EDGE; }
else { return VerilogElementTypes.V_TOKEN_KW_ELSE; }
end { return VerilogElementTypes.V_TOKEN_KW_END; }
endcase { return VerilogElementTypes.V_TOKEN_KW_ENDCASE; }
endconfig { return VerilogElementTypes.V_TOKEN_KW_ENDCONFIG; }
endfunction { return VerilogElementTypes.V_TOKEN_KW_ENDFUNCTION; }
endgenerate { return VerilogElementTypes.V_TOKEN_KW_ENDGENERATE; }
endmodule { return VerilogElementTypes.V_TOKEN_KW_ENDMODULE; }
endprimitive { return VerilogElementTypes.V_TOKEN_KW_ENDPRIMITIVE; }
endspecify { return VerilogElementTypes.V_TOKEN_KW_ENDSPECIFY; }
endtable { return VerilogElementTypes.V_TOKEN_KW_ENDTABLE; }
endtask { return VerilogElementTypes.V_TOKEN_KW_ENDTASK; }
event { return VerilogElementTypes.V_TOKEN_KW_EVENT; }
for { return VerilogElementTypes.V_TOKEN_KW_FOR; }
force { return VerilogElementTypes.V_TOKEN_KW_FORCE; }
forever { return VerilogElementTypes.V_TOKEN_KW_FOREVER; }
fork { return VerilogElementTypes.V_TOKEN_KW_FORK; }
function { return VerilogElementTypes.V_TOKEN_KW_FUNCTION; }
generate { return VerilogElementTypes.V_TOKEN_KW_GENERATE; }
genvar { return VerilogElementTypes.V_TOKEN_KW_GENVAR; }
highz0 { return VerilogElementTypes.V_TOKEN_KW_HIGHZ0; }
highz1 { return VerilogElementTypes.V_TOKEN_KW_HIGHZ1; }
if { return VerilogElementTypes.V_TOKEN_KW_IF; }
ifnone { return VerilogElementTypes.V_TOKEN_KW_IFNONE; }
incdir { return VerilogElementTypes.V_TOKEN_KW_INCDIR; }
include { return VerilogElementTypes.V_TOKEN_KW_INCLUDE; }
initial { return VerilogElementTypes.V_TOKEN_KW_INITIAL; }
inout { return VerilogElementTypes.V_TOKEN_KW_INOUT; }
input { return VerilogElementTypes.V_TOKEN_KW_INPUT; }
instance { return VerilogElementTypes.V_TOKEN_KW_INSTANCE; }
integer { return VerilogElementTypes.V_TOKEN_KW_INTEGER; }
join { return VerilogElementTypes.V_TOKEN_KW_JOIN; }
large { return VerilogElementTypes.V_TOKEN_KW_LARGE; }
liblist { return VerilogElementTypes.V_TOKEN_KW_LIBLIST; }
library { return VerilogElementTypes.V_TOKEN_KW_LIBRARY; }
localparam { return VerilogElementTypes.V_TOKEN_KW_LOCALPARAM; }
macromodule { return VerilogElementTypes.V_TOKEN_KW_MACROMODULE; }
medium { return VerilogElementTypes.V_TOKEN_KW_MEDIUM; }
module { return VerilogElementTypes.V_TOKEN_KW_MODULE; }
nand { return VerilogElementTypes.V_TOKEN_KW_NAND; }
negedge { return VerilogElementTypes.V_TOKEN_KW_NEGEDGE; }
nmos { return VerilogElementTypes.V_TOKEN_KW_NMOS; }
nor { return VerilogElementTypes.V_TOKEN_KW_NOR; }
noshowcancelled { return VerilogElementTypes.V_TOKEN_KW_NOSHOWCANCELLED; }
not { return VerilogElementTypes.V_TOKEN_KW_NOT; }
notif0 { return VerilogElementTypes.V_TOKEN_KW_NOTIF0; }
notif1 { return VerilogElementTypes.V_TOKEN_KW_NOTIF1; }
or { return VerilogElementTypes.V_TOKEN_KW_OR; }
output { return VerilogElementTypes.V_TOKEN_KW_OUTPUT; }
parameter { return VerilogElementTypes.V_TOKEN_KW_PARAMETER; }
pmos { return VerilogElementTypes.V_TOKEN_KW_PMOS; }
posedge { return VerilogElementTypes.V_TOKEN_KW_POSEDGE; }
primitive { return VerilogElementTypes.V_TOKEN_KW_PRIMITIVE; }
pull0 { return VerilogElementTypes.V_TOKEN_KW_PULL0; }
pull1 { return VerilogElementTypes.V_TOKEN_KW_PULL1; }
pulldown { return VerilogElementTypes.V_TOKEN_KW_PULLDOWN; }
pullup { return VerilogElementTypes.V_TOKEN_KW_PULLUP; }
pulsestyle_ondetect { return VerilogElementTypes.V_TOKEN_KW_PULSESTYLE_ONDETECT; }
pulsestyle_onevent { return VerilogElementTypes.V_TOKEN_KW_PULSESTYLE_ONEVENT; }
rcmos { return VerilogElementTypes.V_TOKEN_KW_RCMOS; }
real { return VerilogElementTypes.V_TOKEN_KW_REAL; }
realtime { return VerilogElementTypes.V_TOKEN_KW_REALTIME; }
reg { return VerilogElementTypes.V_TOKEN_KW_REG; }
release { return VerilogElementTypes.V_TOKEN_KW_RELEASE; }
repeat { return VerilogElementTypes.V_TOKEN_KW_REPEAT; }
rnmos { return VerilogElementTypes.V_TOKEN_KW_RNMOS; }
rpmos { return VerilogElementTypes.V_TOKEN_KW_RPMOS; }
rtran { return VerilogElementTypes.V_TOKEN_KW_RTRAN; }
rtranif0 { return VerilogElementTypes.V_TOKEN_KW_RTRANIF0; }
rtranif1 { return VerilogElementTypes.V_TOKEN_KW_RTRANIF1; }
scalared { return VerilogElementTypes.V_TOKEN_KW_SCALARED; }
showcancelled { return VerilogElementTypes.V_TOKEN_KW_SHOWCANCELLED; }
signed { return VerilogElementTypes.V_TOKEN_KW_SIGNED; }
small { return VerilogElementTypes.V_TOKEN_KW_SMALL; }
specify { return VerilogElementTypes.V_TOKEN_KW_SPECIFY; }
specparam { return VerilogElementTypes.V_TOKEN_KW_SPECPARAM; }
strong0 { return VerilogElementTypes.V_TOKEN_KW_STRONG0; }
strong1 { return VerilogElementTypes.V_TOKEN_KW_STRONG1; }
supply0 { return VerilogElementTypes.V_TOKEN_KW_SUPPLY0; }
supply1 { return VerilogElementTypes.V_TOKEN_KW_SUPPLY1; }
table { return VerilogElementTypes.V_TOKEN_KW_TABLE; }
task { return VerilogElementTypes.V_TOKEN_KW_TASK; }
time { return VerilogElementTypes.V_TOKEN_KW_TIME; }
tran { return VerilogElementTypes.V_TOKEN_KW_TRAN; }
tranif0 { return VerilogElementTypes.V_TOKEN_KW_TRANIF0; }
tranif1 { return VerilogElementTypes.V_TOKEN_KW_TRANIF1; }
tri { return VerilogElementTypes.V_TOKEN_KW_TRI; }
tri0 { return VerilogElementTypes.V_TOKEN_KW_TRI0; }
tri1 { return VerilogElementTypes.V_TOKEN_KW_TRI1; }
triand { return VerilogElementTypes.V_TOKEN_KW_TRIAND; }
trior { return VerilogElementTypes.V_TOKEN_KW_TRIOR; }
trireg { return VerilogElementTypes.V_TOKEN_KW_TRIREG; }
unsigned { return VerilogElementTypes.V_TOKEN_KW_UNSIGNED; }
use { return VerilogElementTypes.V_TOKEN_KW_USE; }
vectored { return VerilogElementTypes.V_TOKEN_KW_VECTORED; }
wait { return VerilogElementTypes.V_TOKEN_KW_WAIT; }
wand { return VerilogElementTypes.V_TOKEN_KW_WAND; }
weak0 { return VerilogElementTypes.V_TOKEN_KW_WEAK0; }
weak1 { return VerilogElementTypes.V_TOKEN_KW_WEAK1; }
while { return VerilogElementTypes.V_TOKEN_KW_WHILE; }
wire { return VerilogElementTypes.V_TOKEN_KW_WIRE; }
wor { return VerilogElementTypes.V_TOKEN_KW_WOR; }
xnor { return VerilogElementTypes.V_TOKEN_KW_XNOR; }
xor { return VerilogElementTypes.V_TOKEN_KW_XOR; }

// literals
{SIGNED_NUMBER}\.{UNSIGNED_NUMBER}[eE]{SIGNED_NUMBER} { return VerilogElementTypes.V_TOKEN_FLOAT_LITERAL; }
{SIGNED_NUMBER}[eE]{SIGNED_NUMBER} { return VerilogElementTypes.V_TOKEN_FLOAT_LITERAL; }
{SIGNED_NUMBER}\.{UNSIGNED_NUMBER} { return VerilogElementTypes.V_TOKEN_FLOAT_LITERAL; }
{SIGNED_LITERAL} { return VerilogElementTypes.V_TOKEN_INTEGER_LITERAL; }
{UNSIGNED_NUMBER}?\'[bBoOdDhH]{UNSIGNED_LITERAL} { return VerilogElementTypes.V_TOKEN_BITSTRING_LITERAL; }

// other tokens
[a-zA-Z_][a-zA-Z_0-9]* { return VerilogElementTypes.V_TOKEN_ATOMIC_IDENTIFIER; }
\$[a-zA-Z_][a-zA-Z_0-9]* { return VerilogElementTypes.V_TOKEN_DOLLAR_IDENTIFIER; }

// fallback for unknown characters
[^] { return TokenType.BAD_CHARACTER; }
