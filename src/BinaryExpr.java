public abstract class BinaryExpr extends Expr {
	public BinaryExpr (Expr first, Expr second) {
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

		return this.first.simplify(this, this.second);
	}

	public Expr simplify (BinaryExpr parent, Expr sibling) {
		return parent;
	}

	public abstract Expr simplify (ConstExpr first, Expr second);

	protected abstract String operator ();
	protected Expr first;
	protected Expr second;
}
