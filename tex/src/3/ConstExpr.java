public class ConstExpr extends Expr {
	// ...

	public Expr differentiate (Expr dx) { return new ConstExpr(0); }
}
