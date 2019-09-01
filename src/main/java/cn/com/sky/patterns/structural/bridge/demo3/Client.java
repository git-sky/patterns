package cn.com.sky.patterns.structural.bridge.demo3;


import cn.com.sky.patterns.structural.bridge.demo3.abstraction.Airplane;
import cn.com.sky.patterns.structural.bridge.demo3.abstraction.CargoPlane;
import cn.com.sky.patterns.structural.bridge.demo3.implement.Airbus;
import cn.com.sky.patterns.structural.bridge.demo3.implement.AirplaneMaker;
import cn.com.sky.patterns.structural.bridge.demo3.implement.Boeing;
import org.junit.Test;

/**
 *
 */
public class Client {

    @Test
    public void test() {
        Airplane airplane = new CargoPlane();

        AirplaneMaker airbus = new Airbus();
        airplane.setAirplaneMaker(airbus);
        airplane.fly();


        AirplaneMaker boeing = new Boeing();
        airplane.setAirplaneMaker(boeing);
        airplane.fly();
    }
}