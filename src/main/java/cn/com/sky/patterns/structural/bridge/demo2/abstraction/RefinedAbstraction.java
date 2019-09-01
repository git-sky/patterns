package cn.com.sky.patterns.structural.bridge.demo2.abstraction;

import cn.com.sky.patterns.structural.bridge.demo2.implement.Implementor;

/**
 * 修正抽象化角色
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    //其他的操作方法
    public void otherOperation() {
        System.out.println("otherOperation()....");
    }
}
