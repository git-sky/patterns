package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.model;

public class ConcreteCreator2 implements Creator {
	@Override
	public Product factory() {
		return new ConcreteProduct2();
	}
}