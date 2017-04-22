package cn.com.sky.patterns.structural.proxy.staticproxy.demo;

public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();// 当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。
	}

	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}