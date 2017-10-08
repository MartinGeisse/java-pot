package name.martingeisse.javapot.ide;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 *
 */
public class PotFileType extends LanguageFileType {

	@NonNls
	public static final String DEFAULT_EXTENSION = "pot";

	@NonNls
	public static final String DOT_DEFAULT_EXTENSION = ".pot";

	public static final PotFileType INSTANCE = new PotFileType();

	public PotFileType() {
		super(PotSpecificationLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "JAVAPOT";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "JavaPOT grammar file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return AllIcons.FileTypes.Text;
	}
}
