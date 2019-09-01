package cn.com.sky.patterns.structural.bridge.demo2.implement;

/**
 * 具体实现化角色
 */
public class ConcreteImplementorA extends Implementor {

	@Override
	public void operationImpl() {
		//具体操作
		System.out.println("ConcreteImplementorA -> operationImpl");
	}

}