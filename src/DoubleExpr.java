public class DoubleExpr extends Expr {
	public DoubleExpr (String name) {
		this.name = name;
	}

	public Expr apply (Expr target, double value) {
		return (target == this) ? new ConstExpr(value) : this;
	}

	public String compile () {
		return this.name;
	}

	public Expr differentiate (Expr dx) {
		return (dx == this) ? new ConstExpr(1) : new ConstExpr(0);
	}

	private String name;
}
