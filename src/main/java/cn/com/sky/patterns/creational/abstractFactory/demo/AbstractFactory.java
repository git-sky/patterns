package cn.com.sky.patterns.creational.abstractFactory.demo;

/**
 * 抽象工厂类
 */
public interface AbstractFactory {
	// 制造发动机
	public Engine createEngine();

	// 制造空调
	public Aircondition createAircondition();
}
