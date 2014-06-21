public abstract class BinaryExpr extends Expr {
	// ...

	public String compile () {
		return "(" + this.first.compile() + this.operator() + this.second.compile() + ")";
	}

	protected abstract String operator ();
}
