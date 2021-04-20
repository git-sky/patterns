package cn.com.sky.patterns.structural.proxy.dynamicproxy.cglib.demo2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <pre>
 *
 * 使用cglib动态代理
 *
 * CGLIB是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强。
 * 采用的是继承的方式。
 * 所以不能代理final类和final方法。
 *
 * </pre>
 */
public class CglibProxy implements MethodInterceptor {

    /**
     * <pre>
     * 根据class对象创建该对象的代理对象
     * 1、设置父类；
     * 2、设置回调
     * 本质：动态创建了一个class对象的子类
     * </pre>
     */
    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PeopleTalk.class);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        System.out.println("事物开始");
        result = methodProxy.invokeSuper(object, args);
        System.out.println("事物结束");
        return result;
    }

}