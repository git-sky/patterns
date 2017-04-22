package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.statics;

public class Client {

	public static void main(String[] args) {
		Sender sender = Factory.produceMail();
		sender.Send();
	}
}