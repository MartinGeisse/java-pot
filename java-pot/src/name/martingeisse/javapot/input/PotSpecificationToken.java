package name.martingeisse.javapot.input;

import org.jetbrains.annotations.NotNull;

/**
 *
 */
public final class PotSpecificationToken extends PotSpecificationSymbol {

	private final int tokenCode;

	public PotSpecificationToken(@NotNull String debugName, int tokenCode) {
		super(debugName);
		this.tokenCode = tokenCode;
	}

	public int getTokenCode() {
		return tokenCode;
	}

}
