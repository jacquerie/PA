public class SubExpr extends BinaryExpr {
	public SubExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public String operator () {
		return " - ";
	}
}
