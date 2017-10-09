package name.martingeisse.javapot.input;

/**
 *
 */
public final class PotSpecificationElementTypes {

	public static final PotSpecificationPhony COMMENT = new PotSpecificationPhony("COMMENT");

	public static final PotSpecificationToken QUESTION_MARK = new PotSpecificationToken("QUESTION_MARK", CupGeneratedPotTokenCodes.QUESTION_MARK);
	public static final PotSpecificationToken SEMICOLON = new PotSpecificationToken("SEMICOLON", CupGeneratedPotTokenCodes.SEMICOLON);
	public static final PotSpecificationToken COMMA = new PotSpecificationToken("COMMA", CupGeneratedPotTokenCodes.COMMA);
	public static final PotSpecificationToken ASTERISK = new PotSpecificationToken("ASTERISK", CupGeneratedPotTokenCodes.ASTERISK);
	public static final PotSpecificationToken DOT = new PotSpecificationToken("DOT", CupGeneratedPotTokenCodes.DOT);
	public static final PotSpecificationToken BAR = new PotSpecificationToken("BAR", CupGeneratedPotTokenCodes.BAR);
	public static final PotSpecificationToken PLUS = new PotSpecificationToken("PLUS", CupGeneratedPotTokenCodes.PLUS);
	public static final PotSpecificationToken COLON = new PotSpecificationToken("COLON", CupGeneratedPotTokenCodes.COLON);
	public static final PotSpecificationToken COLON_COLON_EQUALS = new PotSpecificationToken("COLON_COLON_EQUALS", CupGeneratedPotTokenCodes.COLON_COLON_EQUALS);
	public static final PotSpecificationToken PERCENT_PREC = new PotSpecificationToken("PERCENT_PREC", CupGeneratedPotTokenCodes.PERCENT_PREC);
	public static final PotSpecificationToken PACKAGE = new PotSpecificationToken("PACKAGE", CupGeneratedPotTokenCodes.PACKAGE);
	public static final PotSpecificationToken CLASS = new PotSpecificationToken("CLASS", CupGeneratedPotTokenCodes.CLASS);
	public static final PotSpecificationToken TERMINAL = new PotSpecificationToken("TERMINAL", CupGeneratedPotTokenCodes.TERMINAL);
	public static final PotSpecificationToken NONTERMINAL = new PotSpecificationToken("NONTERMINAL", CupGeneratedPotTokenCodes.NONTERMINAL);
	public static final PotSpecificationToken START = new PotSpecificationToken("START", CupGeneratedPotTokenCodes.START);
	public static final PotSpecificationToken PRECEDENCE = new PotSpecificationToken("PRECEDENCE", CupGeneratedPotTokenCodes.PRECEDENCE);
	public static final PotSpecificationToken LEFT = new PotSpecificationToken("LEFT", CupGeneratedPotTokenCodes.LEFT);
	public static final PotSpecificationToken RIGHT = new PotSpecificationToken("RIGHT", CupGeneratedPotTokenCodes.RIGHT);
	public static final PotSpecificationToken NONASSOC = new PotSpecificationToken("NONASSOC", CupGeneratedPotTokenCodes.NONASSOC);
	public static final PotSpecificationToken IDENTIFIER = new PotSpecificationToken("IDENTIFIER", CupGeneratedPotTokenCodes.IDENTIFIER);

	// prevent instantiation
	private PotSpecificationElementTypes() {
	}

}
