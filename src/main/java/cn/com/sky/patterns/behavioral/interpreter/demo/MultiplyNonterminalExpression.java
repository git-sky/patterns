package cn.com.sky.patterns.behavioral.interpreter.demo;

public class MultiplyNonterminalExpression extends AbstractExpression {

	private final AbstractExpression left;
	private final AbstractExpression right;

	public MultiplyNonterminalExpression(final AbstractExpression left, final AbstractExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpreter(final Context context) {
		return this.left.interpreter(context) * this.right.interpreter(context);
	}

}