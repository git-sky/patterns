package cn.com.sky.patterns.structural.decorator.demo2;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}