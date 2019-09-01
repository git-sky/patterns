package cn.com.sky.patterns.structural.bridge.demo;

import cn.com.sky.patterns.structural.bridge.demo.abstraction.Shape;
import cn.com.sky.patterns.structural.bridge.demo.abstraction.ShapeCircle;
import cn.com.sky.patterns.structural.bridge.demo.abstraction.ShapeSquare;
import cn.com.sky.patterns.structural.bridge.demo.implement.Color;
import cn.com.sky.patterns.structural.bridge.demo.implement.ColorGreen;
import cn.com.sky.patterns.structural.bridge.demo.implement.ColorRed;

/**
 * <pre>
 *
 * JDBC是使用Bridge模式进行设计的。
 *
 * 桥接模式（Bridge）用于多维度变化。
 *
 * 注意区分Façade模式、Adapter模式、Bridge模式与Decorator模式:
 * Façade模式注重简化接口
 * Adapter模式注重转换接口
 * Bridge模式注重分离接口（抽象）与其实现
 * Decorator模式注重稳定接口的前提下为对象扩展功能
 *
 * </pre>
 */
public class Cilent {
    public static void main(String[] args) {
        Shape shape = new ShapeCircle();
        Color color = new ColorGreen();
        shape.setColer(color);
        shape.doColor();

        Shape shape2 = new ShapeSquare();
        Color color2 = new ColorRed();
        shape2.setColer(color2);
        shape2.doColor();

        Shape shape3 = new ShapeSquare();
        Color color3 = new ColorGreen();
        shape3.setColer(color3);
        shape3.doColor();
    }
}