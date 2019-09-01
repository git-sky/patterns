package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo3;

/**
 * 动态代理
 */
public class Client {
    public static void main(String args[]) {

        // 被代理对象
        HelloService helloService = new HelloServiceImpl();

        System.out.println("helloService.getClass().getInterfaces()=" + helloService.getClass().getInterfaces());

        System.out.println("helloService.getClass()=" + helloService.getClass());

        for (Class clazz : helloService.getClass().getInterfaces()) {
            System.out.println("clazz.getName()=" + clazz.getName());
        }

        // 代理对象
        HelloService helloServiceProxy = HelloServiceProxyFactory.getHelloServiceProxy(helloService);

        System.out.println("动态代理类的名字为" + helloServiceProxy.getClass().getName());

        helloServiceProxy.say("Hello");

    }
}
