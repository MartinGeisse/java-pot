package name.martingeisse.javapot.input;

import java.lang.Error;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

%%

%class Lexer
%implements FlexLexer
%public
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

// whitespace
Newline = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}

// comments
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" {CommentContent} \*+ "/"
EndOfLineComment = "//" [^\r\n]* {Newline}
CommentContent = ( [^*] | \*+[^*/] )*

// identifiers
ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )*

%%

<YYINITIAL> {
	{Whitespace} { }
	"?" { return PotSpecificationElementTypes.QUESTION_MARK; }
	";" { return PotSpecificationElementTypes.SEMICOLON; }
	"," { return PotSpecificationElementTypes.COMMA; }
	"*" { return PotSpecificationElementTypes.ASTERISK; }
	"." { return PotSpecificationElementTypes.DOT; }
	"|" { return PotSpecificationElementTypes.BAR; }
	"+" { return PotSpecificationElementTypes.PLUS; }
	":" { return PotSpecificationElementTypes.COLON; }
	"::=" { return PotSpecificationElementTypes.COLON_COLON_EQUALS; }
	"%prec" { return PotSpecificationElementTypes.PERCENT_PREC; }
	{Comment} { }
	"package" { return PotSpecificationElementTypes.PACKAGE; }
	"class" { return PotSpecificationElementTypes.CLASS; }
	"terminal" { return PotSpecificationElementTypes.TERMINAL; }
	"nonterminal" { return PotSpecificationElementTypes.NONTERMINAL; }
	"start" { return PotSpecificationElementTypes.START; }
	"precedence" { return PotSpecificationElementTypes.PRECEDENCE; }
	"left" { return PotSpecificationElementTypes.LEFT; }
	"right" { return PotSpecificationElementTypes.RIGHT; }
	"nonassoc" { return PotSpecificationElementTypes.NONASSOC; }
	{ident} { return PotSpecificationElementTypes.IDENTIFIER; }
}

// error fallback
[^] { return TokenType.BAD_CHARACTER; }
