public class AddExpr extends BinaryExpr {
	// ...

	public Expr differentiate (Expr dx) {
		return new AddExpr(this.first.differentiate(dx), this.second.differentiate(dx));
	}
}
