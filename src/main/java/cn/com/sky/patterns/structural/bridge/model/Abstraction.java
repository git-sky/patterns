package cn.com.sky.patterns.structural.bridge.model;

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