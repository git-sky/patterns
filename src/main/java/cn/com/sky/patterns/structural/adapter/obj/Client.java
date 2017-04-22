package cn.com.sky.patterns.structural.adapter.obj;

/**
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中， 调用实例的方法就行。
 *
 * 适配器模式不适合在详细设计阶段使用，它是一种补偿模式，专用来在系统后期扩展、修改时所用。
 */
public class Client {

	public static void main(String[] args) {
		Person p = new Person();
		Job target = new Adapter(p);
		target.speakEnglish();
		target.speakFrench();
		target.speakJapanese();
	}
}