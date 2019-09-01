package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.normal;

/**
 * <pre>
 *
 * 简单工厂模式 顾名思义，这个模式本身很简单，而且使用在业务较简单的情况下。简单工厂模式又称静态工厂方法模式。
 *
 * 简单工厂模式由三种角色组成：
 *
 * 1、工厂类角色：这是本模式的核心，含有一定的业务逻辑和判断逻辑。在java中它往往由一个具体类实现。
 *
 * 2、抽象产品角色：它一般是具体产品继承的父类或者实现的接口。在java中由接口或者抽象类来实现。
 *
 * 3、具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。
 *
 *
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。如果传递的字符串出错，则不能正确创建对象。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Sender smsSender = factory.produce("sms");
        smsSender.send();

        Sender mailSender = factory.produce("mail");
        mailSender.send();
    }
}