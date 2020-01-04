package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxyFactory {

    /**
     * 创建一个实现了HelloService 接口的动态代理类的实例
     */
    public static HelloService getHelloServiceProxy(final HelloService helloService) {

        // 创建一个实现了InvocationHandler接口的匿名类的实例
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object args[]) throws Exception {

                // 预处理
                System.out.println("before calling: " + method);

                // 调用被代理的HelloService 实例的方法
                Object result = method.invoke(helloService, args);

                // 事后处理
                System.out.println("after calling: " + method);

                System.out.println("result= " + result);

                return result;
            }
        };

        Class<HelloService> classType = HelloService.class;

        return (HelloService) Proxy.newProxyInstance(classType.getClassLoader(), new Class[]{classType}, handler);
    }

}
