package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.multi;

public class Factory {
	
	public Sender produceMail(){
		return new SenderMail();
	}
	
	public Sender produceSms(){
		return new SenderSms();
	}
}