package cn.com.sky.patterns.structural.adapter.obj.model;

/**
 * 适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void operation() {
		adaptee.operation();
	}

	@Override
	public void operationNew() {
		System.out.println("operationNew()");
	}

}
