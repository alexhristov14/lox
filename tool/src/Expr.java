import java.util.List;

abstract class Expr {
	static class Binaryextends Expr {
		Binary(Expr left, Token operator, Expr right) {
			this.left = left;
			this.operator = operator;
			this.right = right;
		}

		final Expr left;
		final Token operator;
		final Expr right;
	}

	static class Groupingextends Expr {
		Grouping(Expr expression) {
			this.expression = expression;
		}

		final Expr expression;
	}

	static class Literalextends Expr {
		Literal(Object value) {
			this.value = value;
		}

		final Object value;
	}

	static class Unuaryextends Expr {
		Unuary(Token operator, Expr right) {
			this.operator = operator;
			this.right = right;
		}

		final Token operator;
		final Expr right;
	}

}
