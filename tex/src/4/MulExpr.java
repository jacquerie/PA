public class MulExpr extends BinaryExpr {
	// ...

	public Expr simplify (ConstExpr first, Expr second) {
		return first.isZero() ? first : this;
	}
}
