package cn.com.sky.patterns.structural.decorator.model;

/**
 * 具体的装饰器类A
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // 写相关的业务代码
    }
}
