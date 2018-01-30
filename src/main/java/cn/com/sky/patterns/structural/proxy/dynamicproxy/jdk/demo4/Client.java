package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        InvocationHandler handler = new HelloWorldHandler();

        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(HelloWorld.class.getClassLoader(), new Class[]{HelloWorld.class}, handler);

        proxy.say("zhangsan");

    }

}
