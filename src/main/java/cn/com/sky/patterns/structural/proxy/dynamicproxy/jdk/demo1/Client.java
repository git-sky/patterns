package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo1;

/**
 * 测试类
 *
 * JDK 动态代理的实现需要依赖两个核心组件：InvocationHandler 接口和Proxy 类。
 *
 */
public class Client {

    public static void main(String[] args) {
        // 绑定代理，这种方式会在所有的方法都加上切面方法
        ITalk iTalk = (ITalk) new TalkProxy().bind(new TalkImpl("tony", "16"));
        iTalk.talk("talk");

        System.out.println("=====================================");

        System.out.println("iTalk= " + iTalk.toString());
    }
}