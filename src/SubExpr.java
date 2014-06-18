public class SubExpr extends BinaryExpr {
	public SubExpr (Expr first, Expr second) {
		super(first, second);
	}

	public Expr differentiate (Expr dx) {
		return new SubExpr(
			this.first.differentiate(dx),
			this.second.differentiate(dx)
		);
	}

	protected String operator () {
		return " - ";
	}
}
