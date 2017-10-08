package name.martingeisse.javapot.input;

import com.intellij.psi.tree.IElementType;
import name.martingeisse.javapot.ide.PotSpecificationLanguage;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public final class PotSpecificationToken extends IElementType  {

	public PotSpecificationToken(@NotNull String debugName) {
		super(debugName, PotSpecificationLanguage.INSTANCE);
	}

}
