public class MulExpr extends BinaryExpr {
	public MulExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public String operator () {
		return " * ";
	}
}
