public abstract class BinaryExpr extends Expr {
	// ...

	public Expr simplify () {
		this.first = this.first.simplify();
		this.second = this.second.simplify();
		return this.second.simplify(this, this.first);
	}

	public Expr simplify (UnaryExpr parent) { return parent; }
	public Expr simplify (BinaryExpr parent, Expr sibling) { return parent; }
	public abstract Expr simplify (ConstExpr first, Expr second);
}
