package cn.com.sky.patterns.creational.abstractFactory.demo.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo.AirConditioner.Aircondition;
import cn.com.sky.patterns.creational.abstractFactory.demo.Engine.Engine;

/**
 * 抽象工厂类
 */
public interface AbstractFactory {

    /**
     * 制造发动机
     */
    Engine createEngine();

    /**
     * 制造空调
     */
    Aircondition createAircondition();
}
