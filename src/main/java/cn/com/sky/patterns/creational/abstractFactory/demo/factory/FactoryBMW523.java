package cn.com.sky.patterns.creational.abstractFactory.demo.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo.AirConditioner.Aircondition;
import cn.com.sky.patterns.creational.abstractFactory.demo.AirConditioner.AirconditionB;
import cn.com.sky.patterns.creational.abstractFactory.demo.Engine.Engine;
import cn.com.sky.patterns.creational.abstractFactory.demo.Engine.EngineB;

/**
 * 具体工厂类2
 * 
 * 为宝马523系列生产配件
 */
public class FactoryBMW523 implements AbstractFactory {
	/**
	 * 生产产品B
	 */
	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	/**
	 * 生产产品B
	 */
	@Override
	public Aircondition createAircondition() {
		return new AirconditionB();
	}

}