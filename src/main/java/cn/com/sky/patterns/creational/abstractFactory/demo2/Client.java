package cn.com.sky.patterns.creational.abstractFactory.demo2;

import cn.com.sky.patterns.creational.abstractFactory.demo2.factory.BlackMaleFactory;
import cn.com.sky.patterns.creational.abstractFactory.demo2.factory.IFactory;
import cn.com.sky.patterns.creational.abstractFactory.demo2.factory.WhiteFemaleFactory;

/**
 * <pre>
 *
 * 抽象工厂应用场景：
 * 上帝创造人类
 *
 * 两类抽象产品
 * 抽象产品A：性别Sex
 * 抽象产品B：肤色Color
 *
 * 一个抽象工厂
 * 抽象工厂：生产人类工厂
 *
 * 两个具体工厂
 * 具体工厂1：黑皮肤男性工厂
 * 具体工厂2：白皮肤女性工厂
 *
 * 优点：
 * 增加新肤色和新性别很简单，增加一个具体肤色性别工厂类，一个具体肤色，一个具体性别；
 *
 * 缺点：
 * 增加新的人类属性很复杂，例如增加国籍，每个具体工厂类都要修改；
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {

        IFactory blackMaleFactory = new BlackMaleFactory();
        //创造皮肤
        blackMaleFactory.produceColor();
        //创造性别
        blackMaleFactory.produceSex();


        IFactory whiteFemaleFactory = new WhiteFemaleFactory();
        //创造皮肤
        whiteFemaleFactory.produceColor();
        //创造性别
        whiteFemaleFactory.produceSex();

    }
}