package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1;

import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.factory.BmwFactory;
import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.factory.BuickFactory;
import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.factory.CarFactory;
import cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1.product.Car;

/**
 * 工厂生产汽车
 */
public class Client {

    public static void main(String[] args) {

        CarFactory bmwFactory = new BmwFactory();
        Car bwm = bmwFactory.createCar();
        bwm.docar();

        CarFactory buickFactory = new BuickFactory();
        Car buick = buickFactory.createCar();
        buick.docar();
    }

}
