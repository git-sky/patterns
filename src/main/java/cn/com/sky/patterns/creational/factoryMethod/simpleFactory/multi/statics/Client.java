package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.multi.statics;

/**
 * 静态工厂方法模式，将多个工厂方法模式里的方法置为静态的，不需要实例化工厂类，直接调用即可。
 */
public class Client {

    public static void main(String[] args) {

        Sender mailSender = Factory.produceMail();
        mailSender.send();

        Sender smsSender = Factory.produceSms();
        smsSender.send();
    }
}