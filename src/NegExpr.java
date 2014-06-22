public class NegExpr extends UnaryExpr {
	public NegExpr (Expr argument) { super(argument); }

	public Expr differentiate (Expr dx) {
		return new NegExpr(this.argument.differentiate(dx));
	}

	public Expr simplify (NegExpr parent) {
		return parent.simplify(this);
	}

	protected String operator () {
		return "-";
	}
}
