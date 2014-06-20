public class DoubleExpr extends Expr {
	public DoubleExpr () {}

	public Expr apply (Expr target, double value) {
		return (target == this) ? new ConstExpr(value) : this;
	}
}
