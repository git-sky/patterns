package cn.com.sky.patterns.creational.abstractFactory.demo;

import cn.com.sky.patterns.creational.abstractFactory.demo.factory.FactoryBMW320;
import cn.com.sky.patterns.creational.abstractFactory.demo.factory.FactoryBMW523;

/**
 * <pre>
 *
 * 工厂方法模式与抽象工厂模式区别：
 *
 *
 * 工厂方法模式                                       抽象工厂模式
 *
 * 针对的是一个产品等级结构	                           针对的是面向多个产品等级结构
 * 一个抽象产品类	                                   多个抽象产品类
 * 一个抽象产品类可以派生出多个具体产品类	               每个抽象产品类可以派生出多个具体产品类
 * 一个抽象工厂类，可以派生出多个具体工厂类	           一个抽象工厂类，可以派生出多个具体工厂类
 * 每个具体工厂类只能创建一个具体产品类的实例	           每个具体工厂类可以创建多个具体产品类的实例
 *
 *
 * 抽象工厂优缺点：
 *
 * 优点：
 * 如果再创建一个生产宝马630系列配件，只需要建一个具体工厂，两个具体产品就可以。
 *
 * 缺点：
 * 如果想再增加一个配件，即新的产品，则每个工厂都要修改，代价很大。
 *
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        // 生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        // 生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}