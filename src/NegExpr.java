public class NegExpr extends UnaryExpr {
	public NegExpr (Expr argument) {
		super(argument);
	}

	public Expr apply (Expr target, double value) {
		this.argument = this.argument.apply(target, value);

		return this;
	}

	public String compile () {
		return "- (" + this.argument.compile() + ")";
	}

	public Expr differentiate (Expr dx) {
		return new NegExpr(this.argument.differentiate(dx));
	}
}
