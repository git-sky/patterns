package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        HelloWorld hw = new HelloWorldImpl();

        InvocationHandler handler = new HelloWorldHandler(hw);

        System.out.println("hw.getClass()=" + hw.getClass());
        System.out.println("hw.getClass().getClassLoader()=" + hw.getClass().getClassLoader());
        System.out.println("hw.getClass().getInterfaces()=" + hw.getClass().getInterfaces());


        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(hw.getClass().getClassLoader(), hw.getClass().getInterfaces(), handler);

        proxy.sayHelloWorld();

    }

}
