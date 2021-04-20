package cn.com.sky.patterns.structural.decorator.demo2;

/**
 * 装饰器
 */
public class Decorator implements Sourceable {

	private Sourceable sourceable;

	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;// 当我们使用装饰器模式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		sourceable.method();
		System.out.println("after decorator!");
	}
}