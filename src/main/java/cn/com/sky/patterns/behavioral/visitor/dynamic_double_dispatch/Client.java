package cn.com.sky.patterns.behavioral.visitor.dynamic_double_dispatch;

/**
 * <pre>
 * 
 * 双重分派 　　
 * 
 * 一个方法根据两个宗量的类型来决定执行不同的代码，这就是“双重分派”。
 * 
 * Java语言不支持动态的多分派，也就意味着Java不支持动态的双分派。
 * 
 * 但是通过使用设计模式， 也可以在Java语言里实现动态的双重分派。
 * 
 * 在Java中可以通过两次方法调用来达到两次分派的目的。
 * 
 * 由于这两个名字一个来自East等级结构，另一个来自West等级结构中，因此，它们的组合式是动态决定的。这就是动态双重分派的实现机制。
 */
public class Client {

	public static void main(String[] args) {
		// 组合1
		East east = new SubEast1();
		West west = new SubWest1();
		east.goEast(west);
		// 组合2
		east = new SubEast1();
		west = new SubWest2();
		east.goEast(west);
	}

}