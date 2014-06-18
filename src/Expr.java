public abstract class Expr {
	public abstract Expr apply (Expr target, double value);
	public abstract String compile ();
	public abstract Expr differentiate (Expr dx);

	public Expr add (Expr other) {
		return new AddExpr(this, other);
	}

	public Expr mul (Expr other) {
		return new MulExpr(this, other);
	}

	public Expr sub (Expr other) {
		return new SubExpr(this, other);
	}
}
