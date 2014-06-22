public abstract class Expr {
	public abstract Expr apply (Expr target, double value);
	public abstract String compile ();
	public abstract Expr differentiate (Expr dx);
	public abstract Expr simplify ();
	public abstract Expr simplify (UnaryExpr parent);
	public abstract Expr simplify (BinaryExpr parent, Expr sibling);

	public AddExpr add (Expr that) { return new AddExpr(this, that); }
	public MulExpr mul (Expr that) { return new MulExpr(this, that); }
	public SubExpr sub (Expr that) { return new SubExpr(this, that); }
}
