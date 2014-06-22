public class ConstExpr extends Expr {
	// ...

	public Expr simplify () { return this; }
	public Expr simplify (UnaryExpr parent) { return parent; }
	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent.simplify(this, sibling);
	}

	public boolean isZero () {
		return Math.abs(this.value - 0) < 0.000001;
	}
}
