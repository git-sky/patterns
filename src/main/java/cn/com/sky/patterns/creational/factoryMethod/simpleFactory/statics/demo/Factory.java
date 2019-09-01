package cn.com.sky.patterns.creational.factoryMethod.simpleFactory.statics.demo;

import java.util.Objects;

public class Factory {

    public static Sender produce(String which) {

        if (Objects.equals(which, "mail")) {
            return new SenderMail();
        } else if (Objects.equals(which, "sms")) {
            return new SenderSms();
        } else {
            return null;
        }

    }
}