public class Function {
	public Function (Expr[] arguments, Expr expression) {
		this.arguments = arguments;
		this.expression = expression;
	}

	public Expr apply (double... values) {
		for (int i = 0; i < values.length; i++)
			this.expression = this.expression.apply(arguments[i], values[i]);

		return this.expression;
	}

	public Function differentiate (Expr dx) {
		return new Function(this.arguments, this.expression.differentiate(dx));
	}

	private Expr[] arguments;
	private Expr expression;
}
