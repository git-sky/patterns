package cn.com.sky.patterns.creational.builder.demo1;

//Builder实现:人类
public class HumanBuilder implements PersonBuilder {

	private Person person;

	public HumanBuilder() {
		this.person = new Person();
	}

	public void buildBody() {
		this.person.setBody("创建 人类 身体！");
	}

	public void buildFoot() {
		this.person.setFoot("创建 人类 脚！");
	}

	public void buildHead() {
		this.person.setHead("创建 人类 头！");
	}

	public Person buildPerson() {
		return person;
	}
}
