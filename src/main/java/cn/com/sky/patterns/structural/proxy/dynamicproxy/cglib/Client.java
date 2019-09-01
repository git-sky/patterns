package cn.com.sky.patterns.structural.proxy.dynamicproxy.cglib;

public class Client {

    public static void main(String[] args) {
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
        peopleTalk.talk("业务方法");
    }
}