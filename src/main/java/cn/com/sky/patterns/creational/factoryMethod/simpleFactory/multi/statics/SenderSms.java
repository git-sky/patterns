package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.multi.statics;

public class SenderSms implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
