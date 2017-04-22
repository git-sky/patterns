package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.statics;

public class SenderMail implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mail sender!");
	}
}