package cn.com.sky.patterns.creational.abstractFactory.demo2.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo2.color.Black;
import cn.com.sky.patterns.creational.abstractFactory.demo2.color.Color;
import cn.com.sky.patterns.creational.abstractFactory.demo2.sex.Male;
import cn.com.sky.patterns.creational.abstractFactory.demo2.sex.Sex;

/**
 * 具体工厂类
 */
public class BlackMaleFactory implements IFactory {

    @Override
    public Sex produceSex() {
        return new Male();
    }

    @Override
    public Color produceColor() {
        return new Black();
    }
}