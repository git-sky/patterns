package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo1;

/**
 * 抽象主题角色：声明了真实主题和代理主题的共同接口。
 */
public interface ITalk {

    void talk(String msg);

}