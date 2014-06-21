public class ConstExpr extends Expr {
	// ...

	public String compile () {
		return Double.toString(this.value);
	}
}
