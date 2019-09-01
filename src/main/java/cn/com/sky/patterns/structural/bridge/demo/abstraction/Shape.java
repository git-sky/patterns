package cn.com.sky.patterns.structural.bridge.demo.abstraction;

import cn.com.sky.patterns.structural.bridge.demo.implement.Color;

/**
 * 形状维度
 */
public abstract class Shape {

    protected Color color;

    public void setColer(Color color) {
        this.color = color;
    }

    public abstract void doColor();

}