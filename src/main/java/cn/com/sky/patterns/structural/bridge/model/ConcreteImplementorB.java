package cn.com.sky.patterns.structural.bridge.model;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImp() {
		System.out.println("ConcreteImplementorB.operationImp()");
	}

}
