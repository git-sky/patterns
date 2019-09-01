package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo4;


public class HelloWorldImpl implements HelloWorld {

    @Override
    public String say(String s) {
        System.out.println("say:" + s);
        return "say:" + s;
    }

}