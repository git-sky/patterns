package cn.com.sky.patterns.creational.factoryMethod.SimpleFactory.statics;

public class Factory {
	
	public static Sender produceMail(){
		return new SenderMail();
	}
	
	public static Sender produceSms(){
		return new SenderSms();
	}
}