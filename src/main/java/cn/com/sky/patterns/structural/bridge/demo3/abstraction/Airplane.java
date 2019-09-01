package cn.com.sky.patterns.structural.bridge.demo3.abstraction;

import cn.com.sky.patterns.structural.bridge.demo3.implement.AirplaneMaker;

/**
 * 抽象化角色
 */
public abstract class Airplane {

    protected AirplaneMaker airplaneMaker;

    public void setAirplaneMaker(AirplaneMaker airplaneMaker) {
        this.airplaneMaker = airplaneMaker;
    }

    public abstract void fly();
}