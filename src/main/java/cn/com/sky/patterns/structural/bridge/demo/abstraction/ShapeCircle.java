package cn.com.sky.patterns.structural.bridge.demo.abstraction;

public class ShapeCircle extends Shape {

    @Override
    public void doColor() {
        System.out.println("shape circle ...");
        color.daub();
    }

}