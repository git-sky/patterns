package cn.com.sky.patterns.structural.bridge.demo2.implement;


public class ConcreteImplementorB extends Implementor {

    @Override
    public void operationImpl() {
        //具体操作
        System.out.println("ConcreteImplementorB -> operationImpl");
    }

}