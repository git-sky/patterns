package cn.com.sky.patterns.structural.bridge.demo3.implement;

/**
 * 具体实现化角色：空中客车制造商
 */
public class Airbus extends AirplaneMaker {
    @Override
    public void produce() {
        System.out.println("produce Airbus...");
    }
}