package cn.com.sky.patterns.behavioral.mediator.demo2;

public class HouseOwner extends Person {

	HouseOwner(String name, Mediator mediator) {
		super(name, mediator);
	}

	/**
	 * 与中介者联系
	 */
	public void contact(String message) {
		mediator.contact(message, this);
	}

	/**
	 * 获取信息
	 */
	public void getMessage(String message) {
		System.out.println("房主:" + name + ",获得信息：" + message);
	}
}