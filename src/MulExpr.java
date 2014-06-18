public class MulExpr extends BinaryExpr {
	public MulExpr (Expr first, Expr second) {
		super(first, second);
	}

	public Expr differentiate (Expr dx) {
		return new AddExpr(
			new MulExpr(this.first.differentiate(dx), this.second),
			new MulExpr(this.first, this.second.differentiate(dx))
		);
	}

	public Expr simplify (ConstExpr first, Expr second) {
		return first.isZero() ? first : this;
	}

	protected String operator () {
		return " * ";
	}
}
