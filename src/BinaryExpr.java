public abstract class BinaryExpr extends Expr {
	protected BinaryExpr (Expr first, Expr second) {
		this.first = first;
		this.second = second;
	}

	public Expr apply (Expr target, double value) {
		this.first = this.first.apply(target, value);
		this.second = this.second.apply(target, value);

		return this;
	}

	public String compile () {
		return "(" + this.first.compile() + this.operator() + this.second.compile() + ")";
	}

	public Expr simplify () {
		this.first = this.first.simplify();
		this.second = this.second.simplify();

		return this.second.simplify(this, this.first);
	}

	public Expr simplify (UnaryExpr parent) {
		return parent;
	}

	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent;
	}

	public abstract Expr simplify (ConstExpr first, Expr second);

	protected abstract String operator ();
	protected Expr first;
	protected Expr second;
}
