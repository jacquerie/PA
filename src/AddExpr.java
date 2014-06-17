public class AddExpr extends BinaryExpr {
	public AddExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public Expr differentiate (Expr dx) {
		return new AddExpr(
			this.first.differentiate(dx),
			this.second.differentiate(dx)
		);
	}

	public String operator () {
		return " + ";
	}
}
