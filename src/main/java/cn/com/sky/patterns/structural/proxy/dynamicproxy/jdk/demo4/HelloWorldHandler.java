package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法调用之前
        doBefore();
        // 调用原始对象的方法

        System.out.println("args: " + args);

        System.out.println("className: " + method.getDeclaringClass().getName());
        System.out.println("className2:  " + method.getClass().getName());
        System.out.println("methodName: " + method.getName());
        System.out.println("parameterTypes: " + method.getParameterTypes());

        Method m = HelloWorldImpl.class.getMethod(method.getName(), method.getParameterTypes());
        System.out.println("m: " + m);
        Object result = m.invoke(new HelloWorldImpl(), args);

        System.out.println("result= " + result);


        // 方法调用之后
        doAfter();
        return "hhh";
    }

    private void doBefore() {
        System.out.println("before invoke()...........");
    }

    private void doAfter() {
        System.out.println("after invoke()...........");
    }

}
