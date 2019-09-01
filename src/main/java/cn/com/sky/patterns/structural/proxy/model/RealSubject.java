package cn.com.sky.patterns.structural.proxy.model;


public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}