public class Function {
	// ...

	public Function differentiate (Expr dx) {
		return new Function(
			this.arguments,
			this.expression.differentiate(dx)
		);
	}
}
