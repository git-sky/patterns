package cn.com.sky.patterns.structural.bridge.model;

public class RefinedAbstraction extends Abstraction {

	public void operation() {
		imp.operationImp();
	}

}
