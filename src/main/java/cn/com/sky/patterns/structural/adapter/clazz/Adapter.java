package cn.com.sky.patterns.structural.adapter.clazz;

/**
 * 适配器，类的适配器模式。
 */
public class Adapter extends Person implements Job {

    @Override
    public void speakFrench() {
        System.out.println("I can speak French!");
    }

}
