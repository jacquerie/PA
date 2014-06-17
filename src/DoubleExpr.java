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

	private String name;
}
