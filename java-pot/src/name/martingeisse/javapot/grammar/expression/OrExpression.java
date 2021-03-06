package name.martingeisse.javapot.grammar.expression;

/**
 *
 */
public final class OrExpression extends Expression {

	private final Expression leftOperand;
	private final Expression rightOperand;

	public OrExpression(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public Expression getLeftOperand() {
		return leftOperand;
	}

	public Expression getRightOperand() {
		return rightOperand;
	}

}
