package cn.com.sky.patterns.behavioral.templateMethod;

/**
 * <pre>
 * 
 * 模板方法模式是类的行为模式。
 * 
 * 准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑。
 * 
 * 不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现。这就是模板方法模式的用意。
 * 
 * 在看模板方法的时候，很容易想到工厂方法。因为他们都是让具体的实现放在子类中，但是工厂方法主要是生产出产品，然后去应用产品。
 * 
 * 模板方法是在于依赖子类中的步骤中的其中几个步骤， 具体的步骤已经在基类中写好了。
 * 
 * 同样模板方法模式和策略模式都是封装算法。但是策略模式中的每个策略都是单独的一个类。可以随时去更改策略。
 *
 * 模板方法模式虽然也是封装了算法，其实主要在于封装步骤，具体的实现是根据依靠各个子类。
 * 
 * </pre>
 */
public class Client {

	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);
	}
}