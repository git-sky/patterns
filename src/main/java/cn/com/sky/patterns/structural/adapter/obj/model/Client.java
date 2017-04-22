package cn.com.sky.patterns.structural.adapter.obj.model;

/**
 * <pre>
 * 
 * 
 * * 对象适配器模式（Object Adapter）所涉及的角色:
 *  
 *  目标(Target)角色：客户端需要的接口/类。
 *  源(Adapee)角色：已有的接口/类，需要被适配。
 *  适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。
 *       
 *       
 *  说明：     
 *  Adaptee类并没有operation2()方法，而客户端则期待这个方法。 为使客户端能够使用Adaptee类，需要提供一个包装(Wrapper)类Adapter。
 *  这个包装类包装了一个Adaptee的实例，从而此包装类能够把Adaptee的API与Target类的API衔接起来。 
 *  Adapter与Adaptee是委派关系，这决定了适配器模式是对象的。
 *  Adapter对象中含有Adaptee对象的引用。它们之间是聚合关系，Adaptee对象构成Adapter对象的一部分。
 * 
 * </pre>
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.operation();
		target.operation2();
	}
}
