package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        InvocationHandler handler = new HelloWorldHandler();

//        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(HelloWorld.class.getClassLoader(), new Class[]{HelloWorld.class}, handler);

        //这样也能执行成功，猜测是不是只要是AppClassLoader就行？？
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{HelloWorld.class}, handler);


        proxy.say("zhangsan");


//        try {
//            //error 接口不能实例化
//            System.out.println(HelloWorld.class.newInstance());
//            //ok 具体类才能实例化
//            System.out.println(HelloWorldImpl.class.newInstance());
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }


//        System.out.println("=====================================");
//
//        System.out.println("proxy= " + proxy.toString());

    }

}
