import java.util.List;
import java.util.ArrayList;

public class VectorExpr extends Expr {
	public VectorExpr (int dimension) {
		this.dimension = dimension;
		this.elements = new ArrayList<Expr>(dimension);
	}

	public VectorExpr (int dimension, List<Expr> elements) {
		this.dimension = dimension;
		this.elements = elements;
	}

	public VectorExpr apply (Expr target, double value) {
		for (int i = 0; i < this.dimension; i++)
			this.elements.set(i, this.elements.get(i).apply(target, value));

		return this;
	}

	public String compile () {
		String result = "double result[] = { ";
		for (int i = 0; i < this.dimension; i++)
			result += this.elements.get(i).compile() +
				((i < this.dimension - 1) ? ", " : " };";

		return result;
	}

	public VectorExpr differentiate (Expr dx) {
		for (int i = 0; i < this.dimension; i++)
			this.elements.set(i, this.elements.get(i).differentiate(dx));

		return this;
	}

	public VectorExpr simplify () {
		for (int i = 0; i < this.dimension; i++)
			this.elements.set(i, this.elements.get(i).simplify());

		return this;
	}

	public Expr simplify (UnaryExpr argument) { return this; }
	public Expr simplify (BinaryExpr parent, Expr sibling) { return this; }

	public VectorExpr add (VectorExpr that) {
		List<Expr> newElements = new ArrayList<Expr>(this.dimension);

		for (int i = 0; i < this.dimension; i++)
			newElements.add(i, new AddExpr(this.elements.get(i), that.elements.get(i)));

		return new VectorExpr(this.dimension, newElements);
	}

	protected int dimension;
	protected List<Expr> elements;
}
