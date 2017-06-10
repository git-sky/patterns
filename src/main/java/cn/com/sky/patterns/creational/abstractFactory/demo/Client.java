package cn.com.sky.patterns.creational.abstractFactory.demo;

/**
 * <pre>
 * 
 * 
 * 工厂方法模式                                                                                    抽象工厂模式
 * 
 * 针对的是一个产品等级结构	                                              针对的是面向多个产品等级结构
 * 一个抽象产品类	                                                          多个抽象产品类
 * 一个抽象产品类可以派生出多个具体产品类	           每个抽象产品类可以派生出多个具体产品类
 * 一个抽象工厂类，可以派生出多个具体工厂类	          一个抽象工厂类，可以派生出多个具体工厂类
 * 每个具体工厂类只能创建一个具体产品类的实例	           每个具体工厂类可以创建多个具体产品类的实例
 * 
 * 
 */
public class Client {
	public static void main(String[] args) {
		// 生产宝马320系列配件
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createEngine();
		factoryBMW320.createAircondition();

		// 生产宝马523系列配件
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		factoryBMW523.createEngine();
		factoryBMW523.createAircondition();
	}
}