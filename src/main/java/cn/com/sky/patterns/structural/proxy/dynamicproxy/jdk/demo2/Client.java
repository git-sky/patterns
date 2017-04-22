package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		HelloWorld hw = new HelloWorldImpl();

		InvocationHandler handler = new HelloWorldHandler(hw);

		HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(hw.getClass().getClassLoader(), hw.getClass().getInterfaces(), handler);

		proxy.sayHelloWorld();

	}

}
