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
		Expr e = x.mul(new ConstExpr(2)).mul(new ExpExpr(y));

		Expr[] args = { x, y };
		Function f = new Function(args, e);
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
		Expr z = df.apply(1.5, 2.5);

		System.out.println(z.simplify().compile());
	}

	private static void exerciseFive () {
		Expr x = new DoubleExpr("x");
		Expr y = new DoubleExpr("y");
		Expr z = new DoubleExpr("z");
		Expr[] args = { x, y, z };

		VectorExpr v1 = new VectorExpr(3);
		VectorExpr v2 = new VectorExpr(3);
		VectorExpr v3 = new VectorExpr(3);

		for (int i = 0; i < 3; i++) {
			v1.elements.add(i, args[i]);
			v2.elements.add(i, args[(i + 1) % 3]);
			v3.elements.add(i, args[(i + 2) % 3]);
		}

		Expr s = v1.add(v2).add(v3);

		System.out.println(s.simplify().compile());
	}
}
