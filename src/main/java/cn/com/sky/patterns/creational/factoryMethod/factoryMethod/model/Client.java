package cn.com.sky.patterns.creational.factoryMethod.factoryMethod.model;

/**
 * <pre>
 * 
 * 1. 概念
 * 
 * 工厂方法模式是类的创建模式，又叫做虚拟构造子(Virtual Constructor)模式或者多态性工厂（Polymorphic Factory）模式。
 * 
 * 工厂方法：一抽象产品类派生出多个具体产品类；一抽象工厂类派生出多个具体工厂类；每个具体工厂类只能创建一个具体产品类的实例。
 * 
 * 即定义一个创建对象的接口（即抽象工厂类），让其子类（具体工厂类）决定实例化哪一个类（具体产品类）。具体工厂和具体产品是“一对一”的关系。
 * 
 * 
 * 工厂方法模式：
 * 
 * 1、抽象工厂角色：这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
 * 2、具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。在java中它由具体的类来实现。
 * 3、抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
 * 4、具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
 * 
 */

public class Client {
	private static Creator creator1, creator2;
	private static Product prd1, prd2;

	public static void main(String[] args) {
		creator1 = new ConcreteCreator1();
		prd1 = creator1.factory();
		prd1.consume();

		System.out.println("----------------------------");
		creator2 = new ConcreteCreator2();
		prd2 = creator2.factory();
		prd2.consume();
	}
}