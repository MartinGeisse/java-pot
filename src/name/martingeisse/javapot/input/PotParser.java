package name.martingeisse.javapot.input;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import name.martingeisse.javapot.ide.PotParserDefinition;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PotParser implements PsiParser, LightPsiParser {

	@NotNull
	@Override
	public ASTNode parse(@NotNull IElementType type, @NotNull PsiBuilder builder) {
		parseLight(type, builder);
		return builder.getTreeBuilt();
	}

	@Override
	public void parseLight(IElementType type, PsiBuilder builder) {
		if (type != PotParserDefinition.FILE_ELEMENT_TYPE) {
			throw new IllegalArgumentException("can only parse complete POT files");
		}
		Scanner scanner = () -> {
			builder.advanceLexer();
			IElementType elementType = builder.getTokenType();
			int tokenType = getTokenCodeForElementType(elementType);
			return new Symbol(tokenType, builder.getTokenText());
		};
		CupGeneratedPotParser cupGeneratedPotParser = new CupGeneratedPotParser(scanner);
		Symbol symbol;
		try {
			symbol = cupGeneratedPotParser.parse();
			System.out.println(symbol);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public int getTokenCodeForElementType(IElementType elementType) {
		if (elementType instanceof PotSpecificationToken) {
			return ((PotSpecificationToken)elementType).getTokenCode();
		} else {
			return CupGeneratedPotTokenCodes.error;
		}
	}

}
