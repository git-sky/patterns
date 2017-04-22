package cn.com.sky.patterns.structural.flyweight.composite_model;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 
 * 复合享元模式
 * 在单纯享元模式中，所有的享元对象都是单纯享元对象，也就是说都是可以直接共享的。还有一种较为复杂的情况，将一些单纯享元使用合成模式加以复合，形成复合享元对象。
 * 这样的复合享元对象本身不能共享 ，但是它们可以分解成单纯享元对象，而后者则可以共享。
 * 
 * 
 * 复合享元角色所涉及到的角色如下：
 * 
 * 抽象享元(Flyweight)角色 ：给出一个抽象接口，以规定出所有具体享元角色需要实现的方法。
 * 
 * 具体享元(ConcreteFlyweight)角色：实现抽象享元角色所规定出的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。
 * 
 * 复合享元(ConcreteCompositeFlyweight)角色:复合享元角色所代表的对象是不可以共享的，但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。复合享元角色又称作不可共享的享元对象。
 * 
 * 享元工厂(FlyweightFactory)角色 ：本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。当一个客户端对象调用一个享元对象的时候，享元工厂角色会检查系统中是否已经有
 * 一个符合要求的享元对象。如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个 合适的享元对象。
 * 
 */
public class Client {

	public static void main(String[] args) {
		List<Character> compositeState = new ArrayList<Character>();
		compositeState.add('a');
		compositeState.add('b');
		compositeState.add('c');
		compositeState.add('a');
		compositeState.add('b');

		FlyweightFactory flyFactory = new FlyweightFactory();
		Flyweight compositeFly1 = flyFactory.factory(compositeState);
		Flyweight compositeFly2 = flyFactory.factory(compositeState);
		compositeFly1.operation("Composite Call");

		System.out.println("---------------------------------");
		System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

		Character state = 'a';
		Flyweight fly1 = flyFactory.factory(state);
		Flyweight fly2 = flyFactory.factory(state);
		System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
	}
}