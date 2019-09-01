package cn.com.sky.patterns.creational.abstractFactory.demo3.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo3.body.Body;
import cn.com.sky.patterns.creational.abstractFactory.demo3.body.SquareBody;
import cn.com.sky.patterns.creational.abstractFactory.demo3.head.Head;
import cn.com.sky.patterns.creational.abstractFactory.demo3.head.SquareHead;

/**
 * 具体工厂类-正方形人类工厂
 */
public class SquareFactory implements IFactory {

    @Override
    public Head createHead() {
        return new SquareHead();
    }

    @Override
    public Body createBody() {
        return new SquareBody();
    }
}