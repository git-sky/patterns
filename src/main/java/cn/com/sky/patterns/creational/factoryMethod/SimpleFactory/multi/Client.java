package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.multi;

/**
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Sender sender = factory.produceMail();
		sender.Send();

        Sender s = factory.produceSms();
        s.Send();
	}
}