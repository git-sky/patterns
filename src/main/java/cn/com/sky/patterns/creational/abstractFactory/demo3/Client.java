package cn.com.sky.patterns.creational.abstractFactory.demo3;

import cn.com.sky.patterns.creational.abstractFactory.demo3.factory.IFactory;
import cn.com.sky.patterns.creational.abstractFactory.demo3.factory.RoundFactory;
import cn.com.sky.patterns.creational.abstractFactory.demo3.factory.SquareFactory;

/**
 * <pre>
 *
 * 抽象工厂应用场景：
 * 上帝创造人类
 *
 * 两类抽象产品
 * 抽象产品A：头部Head
 * 抽象产品B：身体Body
 *
 * 一个抽象工厂
 * 抽象工厂：抽象创造人的工厂
 *
 * 两个具体工厂
 * 具体工厂1：圆形人创造工厂
 * 具体工厂2：正方形人创造工厂
 *
 * 优点：
 * 增加新形状人类很简单，增加一个具体工厂类，一个具体Head类，一个具体Body类；
 *
 * 例如：增加三角形人类
 * 具体工厂：TriangleFactory
 * 具体产品A：TriangleHead
 * 具体产品B：TriangleBody
 *
 *
 * 缺点：
 * 给人类增加新部分很难，每个具体工厂类都要修改；
 *
 * 例如：增加尾巴
 *
 * 每个工厂类，都要增加尾巴方法；
 *
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {

        //创造圆形人类
        IFactory roundFactory = new RoundFactory();
        roundFactory.createHead();
        roundFactory.createBody();

        //创造正方形人类
        IFactory squareFactory = new SquareFactory();
        squareFactory.createHead();
        squareFactory.createBody();

    }
}