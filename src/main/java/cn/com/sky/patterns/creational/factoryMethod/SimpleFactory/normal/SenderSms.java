package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.normal;

public class SenderSms implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}
