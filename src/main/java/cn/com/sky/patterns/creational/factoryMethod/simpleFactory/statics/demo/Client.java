package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.demo;


public class Client {

    public static void main(String[] args) {

        Sender sender = Factory.produce("mail");
        sender.send();

        sender = Factory.produce("sms");
        sender.send();
    }
}