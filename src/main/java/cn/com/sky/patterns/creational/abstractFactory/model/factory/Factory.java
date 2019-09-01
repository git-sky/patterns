package cn.com.sky.patterns.creational.abstractFactory.model.factory;

import cn.com.sky.patterns.creational.abstractFactory.model.productA.IProductA;
import cn.com.sky.patterns.creational.abstractFactory.model.productB.IProductB;

/**
 * 每一种牌子的产品生产工厂，即不同的厂商负责自己牌子产品的生产。
 */
public interface Factory{

    IProductA getProductA();

    IProductB getProductB();
}