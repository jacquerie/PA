public abstract class BinaryExpr extends Expr {
	public Expr apply (Expr target, double value) {
		this.first = this.first.apply(target, value);
		this.second = this.second.apply(target, value);

		return this;
	}

	public String compile () {
		return "(" + this.first.compile() + this.operator() + this.second.compile() + ")";
	}

	public String operator () {
		return " @ ";
	}

	protected Expr first;
	protected Expr second;
}
