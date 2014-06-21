public class AddExpr extends BinaryExpr {
	// ...

	public Expr simplify (ConstExpr first, Expr second) {
		return first.isZero() ? second : this;
	}
}
