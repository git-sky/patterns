package cn.com.sky.patterns.structural.decorator.demo1;

/**
 * <pre>
 * 
 * 构建模式的组成
 *   
 * 抽象组件角色(Component)：定义一个对象接口，以规范准备接受附加责任的对象，即可以给这些对象动态地添加职责。
 *   
 * 具体组件角色(ConcreteComponent):被装饰者，定义一个将要被装饰增加功能的类。可以给这个类的对象添加一些职责。
 *   
 * 抽象装饰器(Decorator):维持一个指向构件Component对象的实例， 并定义一个与抽象组件角色Component接口一致的接口。
 *   
 * 具体装饰器角色（ConcreteDecorator):向组件添加职责。
 * 
 * </pre>
 */

public class Client {

	public static void main(String[] args) {

		MessageBoardHandler mb = new MessageBoard();

		String content = mb.filter("一定要学好装饰模式！");

		System.out.println(content);

		mb = new HtmlFilter(new SensitiveFilter(new MessageBoard()));

		content = mb.filter("一定要学好装饰模式！");

		System.out.println(content);

	}

}