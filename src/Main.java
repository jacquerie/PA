public class Main {

	public static void main (String[] args) {
		Expr x = new DoubleExpr();
		Expr y = new DoubleExpr();
		Expr e = new SubExpr(new AddExpr(x, y), y);
		Expr[] arguments = { x, y };
		Function f = new Function(arguments, e);
		Expr v = f.apply(1.5, 2.5);
		System.out.println(v.compile());
	}

}
