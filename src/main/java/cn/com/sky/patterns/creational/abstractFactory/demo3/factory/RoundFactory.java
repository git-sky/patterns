package cn.com.sky.patterns.creational.abstractFactory.demo3.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo3.body.Body;
import cn.com.sky.patterns.creational.abstractFactory.demo3.body.RoundBody;
import cn.com.sky.patterns.creational.abstractFactory.demo3.head.Head;
import cn.com.sky.patterns.creational.abstractFactory.demo3.head.RoundHead;

/**
 * 具体工厂类-圆形人类工厂
 */
public class RoundFactory implements IFactory {

    @Override
    public Head createHead() {
        return new RoundHead();
    }

    @Override
    public Body createBody() {
        return new RoundBody();
    }
}