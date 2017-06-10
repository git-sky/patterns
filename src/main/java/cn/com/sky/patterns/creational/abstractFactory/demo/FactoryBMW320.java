package cn.com.sky.patterns.creational.abstractFactory.demo;

/**
 * 具体工厂类1
 * 
 * 为宝马320系列生产配件
 */
public class FactoryBMW320 implements AbstractFactory {

	/**
	 * 生产产品2
	 */
	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	/**
	 * 生产产品1
	 */
	@Override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}
}
