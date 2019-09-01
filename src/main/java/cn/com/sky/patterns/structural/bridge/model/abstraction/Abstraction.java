package cn.com.sky.patterns.structural.bridge.model.abstraction;

import cn.com.sky.patterns.structural.bridge.model.implement.Implementor;

/**
 * 抽象化角色类，它声明了一个方法operation()，并给出了它的实现。这个实现是通过向实现化对象的委派(调用operationImpl()方法)实现的。
 */
public abstract class Abstraction {

	protected Implementor imp;

	public Implementor getImp() {
		return imp;
	}

	public void setImp(Implementor imp) {
		this.imp = imp;
	}

	public abstract void operation();
}