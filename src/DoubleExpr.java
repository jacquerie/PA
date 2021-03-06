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

	public Expr simplify () { return this; }
	public Expr simplify (UnaryExpr parent) { return parent; }
	public Expr simplify (BinaryExpr parent, Expr sibling) { return parent; }

	private String name;
}
