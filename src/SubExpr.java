public class SubExpr extends BinaryExpr {
	public SubExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public Expr differentiate (Expr dx) {
		return new SubExpr(
			this.first.differentiate(dx),
			this.second.differentiate(dx)
		);
	}

	public String operator () {
		return " - ";
	}
}
