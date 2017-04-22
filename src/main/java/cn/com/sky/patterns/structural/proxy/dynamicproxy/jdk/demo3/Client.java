package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo3;

/**
 * 动态代理
 *
 */
public class Client {
	public static void main(String args[]) {

		// 被代理对象
		HelloService helloService = new HelloServiceImpl();
		// 代理对象
		HelloService helloServiceProxy = HelloServiceProxyFactory.getHelloServiceProxy(helloService);

		System.out.println("动态代理类的名字为" + helloServiceProxy.getClass().getName());

		helloServiceProxy.say("Hello");

	}
}
