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

	private Expr argument;
}
