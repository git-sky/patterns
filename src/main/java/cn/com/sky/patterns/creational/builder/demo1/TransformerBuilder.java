package cn.com.sky.patterns.creational.builder.demo1;

//Builder实现:变形金刚
public class TransformerBuilder implements PersonBuilder {

	private Person person;

	public TransformerBuilder() {
		this.person = new Person();
	}

	public void buildBody() {
		this.person.setBody("创建 变形金刚 身体！");
	}

	public void buildFoot() {
		this.person.setFoot("创建 变形金刚 脚！");
	}

	public void buildHead() {
		this.person.setHead("创建 变形金刚 头！");
	}

	public Person buildPerson() {
		return person;
	}
}