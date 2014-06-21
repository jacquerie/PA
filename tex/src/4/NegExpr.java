public class NegExpr extends UnaryExpr {
	// ...

	public Expr simplify (NegExpr parent) {
		return parent.simplify(this);
	}
}
