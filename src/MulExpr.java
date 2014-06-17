public class MulExpr extends BinaryExpr {
	public MulExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public Expr differentiate (Expr dx) {
		return new AddExpr(
			new MulExpr(this.first.differentiate(dx), this.second),
			new MulExpr(this.first, this.second.differentiate(dx))
		);
	}

	public String operator () {
		return " * ";
	}
}
