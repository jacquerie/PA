public class ExpExpr extends Expr {
	public ExpExpr (Expr argument) {
		this.argument = argument;
	}

	public Expr apply (Expr target, double value) {
		this.argument = this.argument.apply(target, value);

		return this;
	}

	public String compile () {
		return "exp(" + this.argument.compile() + ")";
	}

	public Expr differentiate (Expr dx) {
		return new MulExpr(
			new ExpExpr(this.argument),
			this.argument.differentiate(dx)
		);
	}

	private Expr argument;
}
