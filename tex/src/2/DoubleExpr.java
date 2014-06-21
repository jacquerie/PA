public class DoubleExpr extends Expr {
	// ...

	public DoubleExpr (String name) {
		this.name = name;
	}

	public String compile () {
		return this.name;
	}

	private String name;
}
