package cn.com.sky.patterns.structural.adapter.clazz.model;

/**
 * <pre>
 *
 * 适配器模式 Adapter
 *   
 *   
 * 适用场景：
 *    
 *    适配器模式用于对已有代码的重用。
 *    
 *    如果客户端需要某一种接口(Target)的实现类，但系统中并没有一模一样的类。系统中已有的某种接口或者类(Adaptee)与所要求的接口(Target)有相同或相近的功能，
 *    只需要改变接口名或稍做一些修改就可以重用。适配器模式正适合做这种重用。
 *    
 *    
 * 适配器模式的优点:
 *   
 *   更好的复用性: 系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器模式就可以让这些功能得到更好的复用。
 *   更好的扩展性: 在实现适配器功能的时候，可以调用自己开发的功能，从而自然地扩展系统的功能。
 *   
 *   
 * 适配器模式的缺点:
 * 
 *   过多的使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，其实内部被适配成了B接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。
 *   因此如果不是很有必要 ，可以不使用适配器，而是直接对系统进行重构。
 *  
 *  
 *  
 * 适配器模式分为“类适配模式”和“对象适配模式”两种。
 *  
 *  
 *  
 * 类适配器模式（Class Adapter）所涉及的角色:
 *  
 *  目标(Target)角色：客户端需要的接口。
 *  源(Adapee)角色：已有的接类，需要被适配。
 *  适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。
 *  
 * 
 * 说明：
 * Adapter继承Adaptee类
 *
 * </pre>
 *
 *
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.operation();
		target.operation2();
	}
}