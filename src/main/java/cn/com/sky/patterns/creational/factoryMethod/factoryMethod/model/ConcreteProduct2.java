package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.model;

public class ConcreteProduct2 implements Product {
	public ConcreteProduct2() {
		System.out.println("ConcreteProduct2被创建");
	}

	@Override
	public void consume() {
		System.out.println("consume ConcreteProduct2");
	}

}