public abstract class Expr {
	public abstract Expr apply (Expr target, double value);

	public AddExpr add (Expr that) { return new AddExpr(this, that); }
	public MulExpr mul (Expr that) { return new MulExpr(this, that); }
	public SubExpr sub (Expr that) { return new SubExpr(this, that); }
}
