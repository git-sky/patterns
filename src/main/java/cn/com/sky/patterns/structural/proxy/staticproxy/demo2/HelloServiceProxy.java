package cn.com.sky.patterns.structural.proxy.staticproxy.demo2;

public class HelloServiceProxy implements HelloService {

	private HelloService helloService;// 被代理对象

	public HelloServiceProxy(HelloService helloService) {
		this.helloService = helloService;
	}

	public void setHelloServiceProxy(HelloService helloService) {
		this.helloService = helloService;
	}

	public String say(String str) {
		before();
		String result = helloService.say(str);// 调用被代理对象的方法
		after();
		return result;
	}

	private void before() {
		System.out.println("before say()....");
	}

	private void after() {
		System.out.println("after say()....");
	}

}