package name.martingeisse.javapot.input;

import com.intellij.psi.tree.IElementType;
import name.martingeisse.javapot.ide.PotSpecificationLanguage;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public final class PotSpecificationNonterminal extends IElementType  {

	public PotSpecificationNonterminal(@NotNull String debugName) {
		super(debugName, PotSpecificationLanguage.INSTANCE);
	}

}
