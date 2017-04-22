package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.model;

public class ConcreteProduct1 implements Product {
	public ConcreteProduct1() {
		System.out.println("ConcreteProduct1被创建");
	}

	@Override
	public void consume() {
		System.out.println("consume ConcreteProduct1");
	}
}