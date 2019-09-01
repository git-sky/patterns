package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.normal;

public class Factory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new SenderMail();
        } else if ("sms".equals(type)) {
            return new SenderSms();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}