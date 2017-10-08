package name.martingeisse.javapot.input;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
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

	}

}
