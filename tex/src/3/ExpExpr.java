public class ExpExpr extends UnaryExpr {
	// ...

	public Expr differentiate (Expr dx) {
		return new MulExpr(
			new ExpExpr(this.argument),
			this.argument.differentiate(dx)
		);
	}
}
