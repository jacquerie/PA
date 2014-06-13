public class Function {

	public Function (Expr[] args, Expr expression) {
		this.args = args;
		this.expression = expression;
	}

	public Expr apply (double... values) {
		for (int i = 0; i < args.length; i++) {
			this.args[i].apply(values[i]);
		}

		return this.expression;
	}

	private Expr[] args;
	private Expr expression;

}
