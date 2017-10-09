package name.martingeisse.javapot.grammar;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import name.martingeisse.javapot.ide.PotFileType;
import name.martingeisse.javapot.ide.PotSpecificationLanguage;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PotSourceFile extends PsiFileBase {

	public PotSourceFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, PotSpecificationLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return PotFileType.INSTANCE;
	}

}
