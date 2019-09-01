package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo2;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }
}