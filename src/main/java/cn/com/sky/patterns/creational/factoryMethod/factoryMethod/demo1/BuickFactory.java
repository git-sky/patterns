package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1;


public class BuickFactory implements CarFactory {

	public Car createCar() {
		return new Buick();
	}

}