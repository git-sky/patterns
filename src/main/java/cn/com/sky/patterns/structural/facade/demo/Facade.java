package cn.com.sky.patterns.structural.facade.demo;

public class Facade {

    public void test() {
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}