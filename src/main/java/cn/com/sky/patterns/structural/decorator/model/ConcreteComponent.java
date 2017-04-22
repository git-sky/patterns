package cn.com.sky.patterns.structural.decorator.model;

/**
 * 原始被装饰的类的具体类
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		System.out.println("ConcreteComponent ... ");

	}

}
