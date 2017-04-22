package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.statics;

public class SenderSms implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}
