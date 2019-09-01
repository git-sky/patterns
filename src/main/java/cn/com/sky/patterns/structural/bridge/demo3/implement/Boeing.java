package cn.com.sky.patterns.structural.bridge.demo3.implement;

/**
 * 具体实现化角色:波音制造商
 */
public class Boeing extends AirplaneMaker {
    @Override
    public void produce() {
        System.out.println("produce Boeing...");
    }
}