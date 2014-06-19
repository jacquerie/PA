public class ConstExpr extends Expr {
	public ConstExpr (double value) {
		this.value = value;
	}

	public Expr apply (Expr target, double value) {
		return this;
	}

	public String compile () {
		return Double.toString(this.value);
	}

	public Expr differentiate (Expr dx) {
		return new ConstExpr(0);
	}

	public Expr simplify () {
		return this;
	}

	public Expr simplify (UnaryExpr parent) {
		return parent;
	}

	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent.simplify(this, sibling);
	}

	public boolean isZero () {
		return Math.abs(this.value - 0) < this.EPS;
	}

	private static double EPS = 0.000001;
	private double value;
}
