package cn.com.sky.patterns.structural.bridge.model.implement;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImp() {
		System.out.println("ConcreteImplementorA.operationImp()");
	}

}
