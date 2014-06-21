public class DoubleExpr extends Expr {
	// ...

	public Expr differentiate (Expr dx) {
		return (dx == this) ? new ConstExpr(1) : new ConstExpr(0);
	}
}
