public abstract class UnaryExpr extends Expr {
	protected UnaryExpr (Expr argument) {
		this.argument = argument;
	}

	public Expr apply (Expr target, double value) {
		this.argument = this.argument.apply(target, value);

		return this;
	}

	public Expr simplify () {
		this.argument = this.argument.simplify();

		return this.argument.simplify(this);
	}

	public Expr simplify (UnaryExpr argument) {
		return this.argument;
	}

	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent;
	}

	protected Expr argument;
}
