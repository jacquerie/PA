public class SubExpr extends BinaryExpr {
	// ...

	public Expr simplify (ConstExpr first, Expr second) {
		return first.isZero() ? new NegExpr(second) : this;
	}
}
