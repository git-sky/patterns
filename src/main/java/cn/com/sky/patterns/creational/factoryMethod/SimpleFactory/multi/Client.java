package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.multi;

public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}