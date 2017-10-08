package name.martingeisse.javapot.grammar.expression;

/**
 *
 */
public final class ZeroOrMoreExpression extends Expression {

	private final Expression operand;

	public ZeroOrMoreExpression(Expression operand) {
		this.operand = operand;
	}

	public Expression getOperand() {
		return operand;
	}

}
