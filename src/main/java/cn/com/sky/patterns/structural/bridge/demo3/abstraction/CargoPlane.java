package cn.com.sky.patterns.structural.bridge.demo3.abstraction;

/**
 * 修正抽象化角色:载货飞机
 */
public class CargoPlane extends Airplane {
    @Override
    public void fly() {
        airplaneMaker.produce();
        System.out.println("CargoPlane fly...");
    }
}