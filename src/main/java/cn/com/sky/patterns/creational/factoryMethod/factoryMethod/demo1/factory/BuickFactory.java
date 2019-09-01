package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.factory;


import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.product.Buick;
import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.product.Car;

public class BuickFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Buick();
    }

}