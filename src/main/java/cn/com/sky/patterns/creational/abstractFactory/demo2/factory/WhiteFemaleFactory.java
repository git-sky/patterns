package cn.com.sky.patterns.creational.abstractFactory.demo2.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo2.color.Color;
import cn.com.sky.patterns.creational.abstractFactory.demo2.color.White;
import cn.com.sky.patterns.creational.abstractFactory.demo2.sex.Female;
import cn.com.sky.patterns.creational.abstractFactory.demo2.sex.Sex;

/**
 * 具体工厂类
 */
public class WhiteFemaleFactory implements IFactory {


    @Override
    public Sex produceSex() {
        return new Female();
    }

    @Override
    public Color produceColor() {
        return new White();
    }
}