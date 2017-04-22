package cn.com.sky.patterns.structural.adapter.clazz.model;

public class Adapter extends Adaptee implements Target {

	@Override
	public void operation2() {
		System.out.println("operation2()");
	}

}
