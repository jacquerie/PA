public class Main {
	public static void main (String[] args) {
		exerciseOne();
		exerciseTwo();
		exerciseThree();
		exerciseFour();
		exerciseFive();
	}

	private static void exerciseOne () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr e = x.add(y);

		Expr[] args = { x, y };
		Function f = new Function(args, e);
		Expr v = f.apply(1.5, 2.5);

		System.out.println(v.compile());
	}

	private static void exerciseTwo () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr e = x.mul(new ConstExpr(2)).mul(new ExpExpr(y));

		System.out.println(e.compile());
	}

	private static void exerciseThree () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");

		Expr[] args = { x, y };
		Function f = new Function(args, x.mul(new ConstExpr(2)).mul(new ExpExpr(y)));
		Function df = f.differentiate(x);
		Expr z = df.apply(1.5, 2.5);

		System.out.println(z.compile());
	}

	private static void exerciseFour () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr e = x.mul(new ConstExpr(2)).mul(new ExpExpr(y));

		Expr[] args = { x, y };
		Function f = new Function(args, e);
		Function df = f.differentiate(x);
		Expr z = df.apply(0.0);

		System.out.println(z.simplify().compile());
	}

	private static void exerciseFive () {}
}
