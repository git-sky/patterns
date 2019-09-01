package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.model_variant;

/**
 * <pre>
 * 变体1：如果系统仅有一个具体产品角色，可以省略掉抽象产品角色。
 *
 * 简单工厂模式的三个角色：
 *  1.工厂角色
 *  2.抽象产品角色（省略）
 *  3.具体产品角色
 *
 * 工厂类
 *
 * </pre>
 */
public class Creator {

    /**
     * 静态工厂方法
     *
     * @return
     */
    public static ConcreteProduct factory() {
        return new ConcreteProduct();
    }

}