public abstract class Expr {
	public abstract Expr apply (Expr target, double value);

	public Expr add (Expr that) {
		return new AddExpr(this, that);
	}

	public Expr mul (Expr that) {
		return new MulExpr(this, that);
	}

	public Expr sub (Expr that) {
		return new SubExpr(this, that);
	}
}
