package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1;

public class BmwFactory implements CarFactory {

	public Car createCar() {
		return new Bmw();
	}

}