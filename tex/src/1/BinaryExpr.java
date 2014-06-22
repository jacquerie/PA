public abstract class BinaryExpr extends Expr {
	protected BinaryExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public Expr apply (Expr target, double value) {
		this.first = this.first.apply(target, value);
		this.second = this.second.apply(target, value);

		return this;
	}

	protected Expr first;
	protected Expr second;
}
