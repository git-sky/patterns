package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.model_variant2;

/**
 * <pre>
 * 变体2:工厂角色与抽象产品角色合并
 *
 * 工厂角色可以由抽象产品角色扮演，一个抽象产品类同时是子类的工厂。典型应用：java.text.DateFormat类。
 *
 * 简单工厂模式的三个角色：
 * 1.工厂角色（省略）
 * 2.抽象产品角色
 * 3.具体产品角色
 *
 * </pre>
 */
public abstract class AbstractProduct {

    public static AbstractProduct factory() {
        return new ConcreteProduct();
    }
}