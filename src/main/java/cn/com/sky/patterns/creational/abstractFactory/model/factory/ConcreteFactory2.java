package cn.com.sky.patterns.creational.abstractFactory.model.factory;

import cn.com.sky.patterns.creational.abstractFactory.model.productA.IProductA;
import cn.com.sky.patterns.creational.abstractFactory.model.productA.ProductA2;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.IProductB;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.ProductB2;


public class ConcreteFactory2 implements Factory {

    @Override
    public IProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB getProductB() {
        return new ProductB2();
    }
}