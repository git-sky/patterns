package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo4;


public class HelloWorldImpl implements HelloWorld {

    public String say(String str) {
        System.out.println("say:" + str);
        return "say:" + str;
    }

}