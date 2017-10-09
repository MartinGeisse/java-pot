package name.martingeisse.javapot.input;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.Error;
import java.io.InputStreamReader;

%%

%class Lexer
%implements Tokens
%public
%unicode
%line
%column
%cup
%{
 public Lexer(ComplexSymbolFactory sf){
	this(new InputStreamReader(System.in));
 symbolFactory = sf;
 }
 private StringBuffer sb;
 private ComplexSymbolFactory symbolFactory;
 private int csline,cscolumn;
 public Symbol symbol(String name, int code){
	return symbolFactory.newSymbol(name, code,new Location(yyline+1,yycolumn+1-yylength()),new Location(yyline+1,yycolumn+1));
 }
 public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, new Location(yyline+1, yycolumn +1), new Location(yyline+1,yycolumn+yylength()), lexem);
 }
 protected void emit_warning(String message){
	ErrorManager.getManager().emit_warning("Scanner at " + (yyline+1) + "(" + (yycolumn+1) + "): " + message);
 }
 protected void emit_error(String message){
	ErrorManager.getManager().emit_error("Scanner at " + (yyline+1) + "(" + (yycolumn+1) +  "): " + message);
 }
%}

Newline = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*


%eofval{
	return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%%

<YYINITIAL> {
	{Whitespace} { }
	"?" { return symbol("QESTION_MARK", QUESTION_MARK); }
	";" { return symbol("SEMICOLON", SEMICOLON); }
	"," { return symbol("COMMA", COMMA); }
	"*" { return symbol("ASTERISK", ASTERISK); }
	"." { return symbol("DOT", DOT); }
	"|" { return symbol("BAR", BAR); }
	"+" { return symbol("PLUS", PLUS); }
	":" { return symbol("COLON", COLON); }
	"::=" { return symbol("COLON_COLON_EQUALS", COLON_COLON_EQUALS); }
	"%prec" { return symbol("PERCENT_PREC", PERCENT_PREC); }
	{Comment} { }
	"package" { return symbol("PACKAGE", PACKAGE); }
	"class" { return symbol("CLASS", CLASS); 	 }
	"terminal" { return symbol("PARSER",TERMINAL);	 }
	"nonterminal" { return symbol("NONTERMINAL",NONTERMINAL); }
	"start" { return symbol("START",START);		 }
	"precedence" { return symbol("PRECEDENCE",PRECEDENCE); }
	"left" { return symbol("LEFT",LEFT);		 }
	"right" { return symbol("RIGHT",RIGHT);		 }
	"nonassoc" { return symbol("NONASSOC",NONASSOC); }
	{ident} { return symbol("IDENTIFIER",IDENTIFIER,yytext()); }
}

// error fallback
[^] { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
