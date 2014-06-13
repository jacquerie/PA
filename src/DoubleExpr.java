public class DoubleExpr implements Expr {

	public DoubleExpr () {}

	public void apply (double value) {
		this.value = value;
	}

	public String compile () {
		return Double.toString(this.value);
	}

	private double value;

}
