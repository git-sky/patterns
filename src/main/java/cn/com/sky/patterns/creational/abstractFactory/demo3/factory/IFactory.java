package cn.com.sky.patterns.creational.abstractFactory.demo3.factory;

import cn.com.sky.patterns.creational.abstractFactory.demo3.body.Body;
import cn.com.sky.patterns.creational.abstractFactory.demo3.head.Head;

/**
 * 抽象工厂类
 */
public interface IFactory {

    Head createHead();

    Body createBody();
}