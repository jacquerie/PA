public class ExpExpr extends UnaryExpr {
	public ExpExpr (Expr argument) { super(argument); }

	public Expr differentiate (Expr dx) {
		return new MulExpr(new ExpExpr(this.argument), this.argument.differentiate(dx));
	}

	public Expr simplify (UnaryExpr parent) { return parent; }

	protected String operator () { return "exp"; }
}
