package cn.com.sky.patterns.creational.abstractFactory.demo2.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo2.color.Color;
import cn.com.sky.patterns.creational.abstractFactory.demo2.sex.Sex;

/**
 * 抽象工厂类
 */
public interface IFactory {

    Sex produceSex();

    Color produceColor();
}