package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.multi.statics;

public class SenderMail implements Sender {

	@Override
	public void send() {
		System.out.println("this is mail sender!");
	}
}