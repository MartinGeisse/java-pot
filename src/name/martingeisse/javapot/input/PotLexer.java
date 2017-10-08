package name.martingeisse.javapot.input;

import com.intellij.lexer.FlexAdapter;

/**
 *
 */
public class PotLexer extends FlexAdapter {

	public PotLexer() {
		super(new FlexGeneratedPotLexer(null));
	}

}
