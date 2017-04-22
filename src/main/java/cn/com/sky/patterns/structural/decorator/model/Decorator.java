package cn.com.sky.patterns.structural.decorator.model;

/**
 * 装饰器类
 */
public class Decorator implements Component {

	private Component component;

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		System.out.println("before operation()");
		component.operation();
		System.out.println("after operation()");
	}
}
