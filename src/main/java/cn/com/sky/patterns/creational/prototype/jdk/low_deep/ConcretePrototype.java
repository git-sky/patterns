package cn.com.sky.patterns.creational.prototype.jdk.low_deep;


public class ConcretePrototype extends Prototype {

    ConcretePrototype() {
        System.out.println("ConcretePrototype...");
    }

    public void show() {
        System.out.println("原型模式实现类" + this);
    }
}