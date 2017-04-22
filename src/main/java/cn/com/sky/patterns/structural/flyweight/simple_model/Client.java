package cn.com.sky.patterns.structural.flyweight.simple_model;

/**
 * <pre>
 * 
 * 
 * 享元模式的优缺点:
 *  
 * 享元模式的优点在于它大幅度地降低内存中对象的数量。但是，它做到这一点所付出的代价也是很高的：
 * 享元模式使得系统更加复杂。为了使对象可以共享，需要将一些状态外部化，这使得程序的逻辑复杂化。
 * 享元模式将享元对象的状态外部化，而读取外部状态使得运行时间稍微变长。
 *  
 *  
 *  享元模式可以分成单纯享元模式和复合享元模式两种形式。
 *  
 *  
 *  单纯享元模式所涉及到的角色如下：
 *  
 *  抽象享元(Flyweight)角色 ：给出一个抽象接口，以规定出所有具体享元角色需要实现的方法。
 *  
 *  具体享元(ConcreteFlyweight)角色：实现抽象享元角色所规定出的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 *  
 *  享元工厂(FlyweightFactory)角色 ：本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。
 * 当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个符合要求的享元对象 。如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象。
 * 
 * 
 */
public class Client {

	public static void main(String[] args) {

		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");

		fly = factory.factory(new Character('b'));
		fly.operation("Second Call");

		fly = factory.factory(new Character('a'));
		fly.operation("Third Call");
	}

}