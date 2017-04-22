package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldHandler implements InvocationHandler {

	private Object objOriginal;

	public HelloWorldHandler(Object obj) {
		this.objOriginal = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		// 方法调用之前
		doBefore();
		// 调用原始对象的方法
		result = method.invoke(this.objOriginal, args);
		// 方法调用之后
		doAfter();
		return result;
	}

	private void doBefore() {
		System.out.println("before invoke()...........");
	}

	private void doAfter() {
		System.out.println("after invoke()...........");
	}

}
