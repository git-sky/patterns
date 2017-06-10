package cn.com.sky.patterns.creational.abstractFactory.demo;

/**
 * 具体工厂类2
 * 
 * 为宝马523系列生产配件
 */
public class FactoryBMW523 implements AbstractFactory {
	/**
	 * 生产产品2
	 */
	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	/**
	 * 生产产品1
	 */
	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}

}