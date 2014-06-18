public class AddExpr extends BinaryExpr {
	public AddExpr (Expr first, Expr second) {
		super(first, second);
	}

	public Expr differentiate (Expr dx) {
		return new AddExpr(
			this.first.differentiate(dx),
			this.second.differentiate(dx)
		);
	}

	protected String operator () {
		return " + ";
	}
}
