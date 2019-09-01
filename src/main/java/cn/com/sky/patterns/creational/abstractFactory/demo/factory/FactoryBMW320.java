package cn.com.sky.patterns.creational.abstractFactory.demo.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo.AirConditioner.Aircondition;
import cn.com.sky.patterns.creational.abstractFactory.demo.AirConditioner.AirconditionA;
import cn.com.sky.patterns.creational.abstractFactory.demo.Engine.Engine;
import cn.com.sky.patterns.creational.abstractFactory.demo.Engine.EngineA;

/**
 * 具体工厂类1
 * 
 * 为宝马320系列生产配件
 */
public class FactoryBMW320 implements AbstractFactory {

	/**
	 * 生产产品A
	 */
	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	/**
	 * 生产产品A
	 */
	@Override
	public Aircondition createAircondition() {
		return new AirconditionA();
	}
}
