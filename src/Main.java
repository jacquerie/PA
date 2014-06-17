public class Main {
	public static void main (String[] args) {
		exerciseOne();
		exerciseTwo();
	}

	private static void exerciseOne () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr e = new AddExpr(x, y);

		Expr[] args = { x, y };
		Function f = new Function(args, e);
		Expr v = f.apply(1.5, 2.5);

		System.out.println(v.compile());
	}

	private static void exerciseTwo () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr e = new MulExpr(new MulExpr(new ConstExpr(2), x), new ExpExpr(y));

		System.out.println(e.compile());
	}
}
