package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.multi.statics;

public class Factory {
	
	public static Sender produceMail(){
		return new SenderMail();
	}
	
	public static Sender produceSms(){
		return new SenderSms();
	}
}