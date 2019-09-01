package cn.com.sky.patterns.structural.bridge.demo2.abstraction;

import cn.com.sky.patterns.structural.bridge.demo2.implement.Implementor;

/**
 * 抽象化角色类，它声明了一个方法operation()，并给出了它的实现。这个实现是通过向实现化对象的委派(调用operationImpl()方法)实现的。
 */
public abstract class Abstraction {

    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public void operation() {
        impl.operationImpl();
    }
}