public abstract class UnaryExpr extends Expr {
	public Expr apply (Expr target, double value) {
		this.argument = this.argument.apply(target, value);

		return this;
	}

	protected Expr argument;
}
