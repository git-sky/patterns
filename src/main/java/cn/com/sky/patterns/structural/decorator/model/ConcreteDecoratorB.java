package cn.com.sky.patterns.structural.decorator.model;

/**
 * 具体的装饰器类B
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        // 写相关的业务代码
    }
}
