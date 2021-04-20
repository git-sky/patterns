package cn.com.sky.patterns.structural.proxy.dynamicproxy.cglib.demo2;

public class Client {

    public static void main(String[] args) {
        PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance();
        peopleTalk.talk("业务方法");
    }
}