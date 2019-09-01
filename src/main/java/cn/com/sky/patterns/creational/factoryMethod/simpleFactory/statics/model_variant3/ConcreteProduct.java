package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.model_variant3;

/**
 * <pre>
 *
 * 变体3:三个角色全部合并
 *
 * 类似于单例模式和多例模式，但又不一样。
 *
 * </pre>
 */
public class ConcreteProduct {

    public ConcreteProduct() {
    }

    /**
     * 静态工厂方法
     *
     * @return
     */
    public static ConcreteProduct factory() {
        return new ConcreteProduct();
    }
}