package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.model;

public class ConcreteCreator1 implements Creator {
	public Product factory() {
		return new ConcreteProduct1();
	}
}