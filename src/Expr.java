public abstract class Expr {
	public abstract Expr apply (Expr target, double value);
	public abstract String compile ();
}
