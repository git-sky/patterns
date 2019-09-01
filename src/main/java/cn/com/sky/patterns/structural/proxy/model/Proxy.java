package cn.com.sky.patterns.structural.proxy.model;


public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realSubject.request();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}