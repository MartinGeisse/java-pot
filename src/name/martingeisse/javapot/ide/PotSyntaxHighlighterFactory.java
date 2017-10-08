package name.martingeisse.javapot.ide;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import name.martingeisse.javapot.input.FlexGeneratedPotLexer;
import name.martingeisse.javapot.input.PotSpecificationElementTypes;
import name.martingeisse.javapot.input.PotSpecificationToken;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PotSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

	public PotSyntaxHighlighterFactory() {
		System.out.println();
	}

	@Override
	@NotNull
	public SyntaxHighlighter getSyntaxHighlighter(final Project project, final VirtualFile virtualFile) {
		return new SyntaxHighlighterBase() {

			@NotNull
			@Override
			public Lexer getHighlightingLexer() {
				return new FlexAdapter(new FlexGeneratedPotLexer(null));
			}

			@NotNull
			@Override
			public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
				if (tokenType instanceof PotSpecificationToken) {
					if (tokenType == PotSpecificationElementTypes.IDENTIFIER) {
						return PotTextAttributeKeys.IDENTIFIER;
					} else if (tokenType == PotSpecificationElementTypes.PACKAGE) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.CLASS) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.LEFT) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.RIGHT) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.NONASSOC) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.TERMINAL) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.NONTERMINAL) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.PRECEDENCE) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.PERCENT_PREC) {
						return PotTextAttributeKeys.KEYWORD;
					} else if (tokenType == PotSpecificationElementTypes.DOT) {
						return PotTextAttributeKeys.DOT;
					} else if (tokenType == PotSpecificationElementTypes.COMMA) {
						return PotTextAttributeKeys.COMMA;
					} else if (tokenType == PotSpecificationElementTypes.QUESTION_MARK) {
						return PotTextAttributeKeys.QUESTION_MARK;
					} else if (tokenType == PotSpecificationElementTypes.ASTERISK) {
						return PotTextAttributeKeys.ASTERISK;
					} else if (tokenType == PotSpecificationElementTypes.PLUS) {
						return PotTextAttributeKeys.PLUS;
					} else if (tokenType == PotSpecificationElementTypes.BAR) {
						return PotTextAttributeKeys.BAR;
					} else if (tokenType == PotSpecificationElementTypes.COLON) {
						return PotTextAttributeKeys.COLON;
					} else if (tokenType == PotSpecificationElementTypes.COLON_COLON_EQUALS) {
						return PotTextAttributeKeys.COLON_COLON_EQUALS;
					} else if (tokenType == PotSpecificationElementTypes.SEMICOLON) {
						return PotTextAttributeKeys.SEMICOLON;
					} else if (tokenType == TokenType.BAD_CHARACTER) {
						return PotTextAttributeKeys.BAD_CHARACTER;
					}
				}
				return EMPTY;
				// TODO comments
			}

		};
	}

}
