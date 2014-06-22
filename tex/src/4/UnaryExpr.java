public abstract class UnaryExpr extends Expr {
	// ...

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
}
