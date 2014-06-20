public class Function {
	public Function (Expr[] arguments, Expr expression) {
		this.arguments = arguments;
		this.expression = expression;
	}

	public Expr apply (double... values) {
		for (int i = 0; i < values.length; i++) {
			this.expression = this.expression.apply(arguments[i], values[i]);
		}

		return this.expression;
	}

	private Expr[] arguments;
	private Expr expression;
}
