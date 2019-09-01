package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.factory;

import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.product.Bmw;
import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.product.Car;

public class BmwFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Bmw();
    }

}