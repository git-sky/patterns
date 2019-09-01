package cn.com.sky.patterns.structural.bridge.demo.abstraction;

public class ShapeSquare extends Shape {

    @Override
    public void doColor() {
        System.out.println("shape square ...");
        color.daub();
    }

}