public abstract class UnaryExpr extends Expr {
	// ...

	public String compile () {
		return this.operator() + "(" + this.argument.compile() + ")";
	}

	protected abstract String operator ();
}
