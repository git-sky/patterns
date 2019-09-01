package cn.com.sky.patterns.creational.abstractFactory.model;

import cn.com.sky.patterns.creational.abstractFactory.model.factory.ConcreteFactory1;
import cn.com.sky.patterns.creational.abstractFactory.model.factory.ConcreteFactory2;
import cn.com.sky.patterns.creational.abstractFactory.model.factory.Factory;
import cn.com.sky.patterns.creational.abstractFactory.model.productA.IProductA;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.IProductB;

/**
 * <pre>
 *
 * 工厂方法模式：
 * 一个抽象产品类，可以派生出多个具体产品类。
 * 一个抽象工厂类，可以派生出多个具体工厂类。
 * 每个具体工厂类只能创建一个具体产品类的实例。
 *
 * 抽象工厂模式：
 * 多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。
 * 一个抽象工厂类，可以派生出多个具体工厂类。
 * 每个具体工厂类可以创建多个具体产品类的实例。
 */
public class Client {

    public static void main(String[] args) {
        // 厂商1负责生产产品A1、B1
        Factory factory1 = new ConcreteFactory1();
        IProductA productA1 = factory1.getProductA();
        IProductB productB1 = factory1.getProductB();

        productA1.method();
        productB1.method();

        // 厂商2负责生产产品A2、B2
        Factory factory2 = new ConcreteFactory2();
        IProductA productA2 = factory2.getProductA();
        IProductB productB2 = factory2.getProductB();

        productA2.method();
        productB2.method();
    }
}