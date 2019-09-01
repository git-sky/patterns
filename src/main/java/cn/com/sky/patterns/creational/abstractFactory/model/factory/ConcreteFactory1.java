package cn.com.sky.patterns.creational.abstractFactory.model.factory;

import cn.com.sky.patterns.creational.abstractFactory.model.productA.IProductA;
import cn.com.sky.patterns.creational.abstractFactory.model.productA.ProductA1;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.IProductB;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.ProductB1;

/**
 * 具体的工厂用来生产相关的产品
 */
public class ConcreteFactory1 implements Factory {

    @Override
    public IProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB1();
    }
}