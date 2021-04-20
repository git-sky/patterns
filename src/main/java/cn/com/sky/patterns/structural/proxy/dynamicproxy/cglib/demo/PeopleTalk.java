package cn.com.sky.patterns.structural.proxy.dynamicproxy.cglib.demo;

/**
 * 业务类
 */
public class PeopleTalk {

    public void talk(String msg) {
        System.out.println("people talk:" + msg);
    }
}