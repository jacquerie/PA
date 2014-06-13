public class AddExpr implements Expr {

	public AddExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public String compile () {
		return "(" + this.first.compile() + " + " + this.second.compile() + ")";
	}

	private Expr first;
	private Expr second;

}
