package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.demo1;

public class Client {

	public static void main(String[] args) {

		CarFactory factory = new BmwFactory();
		Car bwm = factory.createCar();
		bwm.docar();

		factory = new BuickFactory();
		Car buick = factory.createCar();
		buick.docar();

	}

}
