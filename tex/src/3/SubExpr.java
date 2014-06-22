public class SubExpr extends BinaryExpr {
	// ...

	public Expr differentiate (Expr dx) {
		return new SubExpr(this.first.differentiate(dx), this.second.differentiate(dx));
	}
}
