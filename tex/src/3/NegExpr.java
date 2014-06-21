public class NegExpr extends UnaryExpr {
	// ...

	public Expr differentiate (Expr dx) {
		return new NegExpr(this.argument.differentiate(dx));
	}
}
