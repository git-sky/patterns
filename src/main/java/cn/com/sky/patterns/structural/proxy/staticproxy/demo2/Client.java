package cn.com.sky.patterns.structural.proxy.staticproxy.demo2;

/**
 * <pre>
 * 
 * 静态代理
 * 
 * 缺点： 如果像HelloServiceImpl这样的类很多，需要写很多个HelloServiceProxy这样的类。
 * 
 * </pre>
 */
public class Client {

	public static void main(String args[]) {

		// 被代理对象
		HelloService helloService = new HelloServiceImpl();
		// 代理对象
		HelloService helloServiceProxy = new HelloServiceProxy(helloService);

		helloServiceProxy.say("hello");

	}
}
