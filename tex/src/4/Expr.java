public abstract class Expr {
	// ...

	public abstract Expr simplify ();
	public abstract Expr simplify (UnaryExpr parent);
	public abstract Expr simplify (BinaryExpr parent, Expr sibling);
}
