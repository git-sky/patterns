package cn.com.sky.patterns.structural.proxy.staticproxy.demo;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}