package name.martingeisse.javapot.input;

/**
 *
 */
public final class PotSpecificationElementTypes {

	public static final PotSpecificationToken QUESTION_MARK = new PotSpecificationToken("QUESTION_MARK");
	public static final PotSpecificationToken SEMICOLON = new PotSpecificationToken("SEMICOLON");
	public static final PotSpecificationToken COMMA = new PotSpecificationToken("COMMA");
	public static final PotSpecificationToken ASTERISK = new PotSpecificationToken("ASTERISK");
	public static final PotSpecificationToken DOT = new PotSpecificationToken("DOT");
	public static final PotSpecificationToken BAR = new PotSpecificationToken("BAR");
	public static final PotSpecificationToken PLUS = new PotSpecificationToken("PLUS");
	public static final PotSpecificationToken COLON = new PotSpecificationToken("COLON");
	public static final PotSpecificationToken COLON_COLON_EQUALS = new PotSpecificationToken("COLON_COLON_EQUALS");
	public static final PotSpecificationToken PERCENT_PREC = new PotSpecificationToken("PERCENT_PREC");
	public static final PotSpecificationToken PACKAGE = new PotSpecificationToken("PACKAGE");
	public static final PotSpecificationToken CLASS = new PotSpecificationToken("CLASS");
	public static final PotSpecificationToken TERMINAL = new PotSpecificationToken("TERMINAL");
	public static final PotSpecificationToken NONTERMINAL = new PotSpecificationToken("NONTERMINAL");
	public static final PotSpecificationToken START = new PotSpecificationToken("START");
	public static final PotSpecificationToken PRECEDENCE = new PotSpecificationToken("PRECEDENCE");
	public static final PotSpecificationToken LEFT = new PotSpecificationToken("LEFT");
	public static final PotSpecificationToken RIGHT = new PotSpecificationToken("RIGHT");
	public static final PotSpecificationToken NONASSOC = new PotSpecificationToken("NONASSOC");
	public static final PotSpecificationToken IDENTIFIER = new PotSpecificationToken("IDENTIFIER");

	// prevent instantiation
	private PotSpecificationElementTypes() {
	}

}
