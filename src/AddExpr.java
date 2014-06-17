public class AddExpr extends BinaryExpr {
	public AddExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public String operator () {
		return " + ";
	}
}
