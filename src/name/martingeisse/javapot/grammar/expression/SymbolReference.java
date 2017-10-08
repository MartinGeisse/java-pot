package name.martingeisse.javapot.grammar.expression;

/**
 *
 */
public final class SymbolReference extends Expression {

	private final String symbolName;

	public SymbolReference(String symbolName) {
		this.symbolName = symbolName;
	}

	public String getSymbolName() {
		return symbolName;
	}

}
