public class ExpExpr implements Expr {

	public ExpExpr (Expr exponent) {
		this.exponent = exponent;
	}

	public String compile () {
		return "exp(" + exponent.compile() + ")";
	}

	private Expr exponent;

}
