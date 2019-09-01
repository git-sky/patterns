package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.model;


/**
 * <pre>
 * 简单工厂模式是类的创建模式，又叫做静态工厂方法（Static Factory Method）模式。
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 * 简单工厂模式就是由一个工厂类可以根据传入的参量决定创建出哪一种产品类的实例。
 *
 * 简单工厂模式的三个角色：
 * 1.工厂角色
 * 2.抽象产品角色
 * 3.具体产品角色
 *
 * 模式的核心是：工厂角色；
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
    public static Product factory(String which) {
        if (which.equalsIgnoreCase("1")) {
            return new ConcreteProduct1();
        } else if (which.equalsIgnoreCase("2")) {
            return new ConcreteProduct2();
        } else {
            return null;
        }

    }

}