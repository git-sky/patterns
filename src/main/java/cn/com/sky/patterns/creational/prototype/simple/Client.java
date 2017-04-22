package cn.com.sky.patterns.creational.prototype.simple;

/**
 * <pre>
 * 
 * 　这种形式涉及到三个角色：
 * 
 * 　　（1）客户(Client)角色：客户类提出创建对象的请求。
 * 　　（2）抽象原型(Prototype)角色：这是一个抽象角色，通常由一个Java接口或Java抽象类实现。此角色给出所有的具体原型类所需的接口。
 * 　　（3）具体原型（Concrete Prototype）角色：被复制的对象。此角色需要实现抽象的原型角色所要求的接口。
 * 
 */
public class Client {

	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		p1.clone();
	}
}