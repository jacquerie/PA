public class ConstExpr extends Expr {
	public ConstExpr (double value) {
		this.value = value;
	}

	public Expr apply (Expr target, double value) {
		return this;
	}

	private double value;
}
