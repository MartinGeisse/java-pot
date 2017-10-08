package name.martingeisse.javapot.input;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PotSpecificationLanguage extends Language {

	public static final PotSpecificationLanguage INSTANCE = new PotSpecificationLanguage();

	public PotSpecificationLanguage() {
		super("JAVAPOT", "text/x-javapot");
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "JavaPOT";
	}

	@Override
	public boolean isCaseSensitive() {
		return true;
	}

}
