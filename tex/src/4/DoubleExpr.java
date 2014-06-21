public class DoubleExpr extends Expr {
	// ...

	public Expr simplify () {
		return this;
	}

	public Expr simplify (UnaryExpr parent) {
		return parent;
	}

	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent;
	}
}
