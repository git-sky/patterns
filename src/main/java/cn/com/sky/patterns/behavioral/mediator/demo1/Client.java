package cn.com.sky.patterns.behavioral.mediator.demo1;

/**
 * <pre>
 * 
 * 调停者模式(中介者模式)的一个潜在缺点是，过度集中化。如果同事对象的交互非常多，而且比较复杂，当这些复杂性全部集中到调停者的时候， 会导致调停者对象变得十分复杂， 而且难于管理和维护。
 * 
 */
public class Client {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}