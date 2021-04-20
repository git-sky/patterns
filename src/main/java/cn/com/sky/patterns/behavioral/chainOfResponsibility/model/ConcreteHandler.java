package cn.com.sky.patterns.behavioral.chainOfResponsibility.model;

public class ConcreteHandler extends Handler {

	private String name;

	public ConcreteHandler(String name) {
		this.name = name;
	}

	@Override
	public void handleRequest() {
		System.out.println(name + " deal!");
		if (getHandler() != null) {
			getHandler().handleRequest();
		}
	}
}