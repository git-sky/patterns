package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.normal;

public class SenderSms implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
