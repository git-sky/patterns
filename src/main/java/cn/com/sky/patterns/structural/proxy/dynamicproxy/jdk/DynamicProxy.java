package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

interface Business {
	void bus();
}

// 抽象角色：java动态代理的实现目前只支持接口，不支持抽象类
interface BusinessFoo extends Business {
	void foo();
}

interface BusinessBar extends Business {
	String bar(String message);
}

// 真实角色：真正实现业务逻辑方法
class BusinessFooImpl implements BusinessFoo {
	public void foo() {
		System.out.println("BusinessFooImpl.foo()");
	}

	@Override
	public void bus() {
		System.out.println("foo bus ...");
	}
}

class BusinessBarImpl implements BusinessBar {
	public String bar(String message) {
		System.out.println("BusinessBarImpl.bar()");
		return message;
	}

	@Override
	public void bus() {
		System.out.println("bar bus ...");
	}
}

// 动态角色：动态生成代理类
class BusinessImplProxy implements InvocationHandler {

	private Business obj;

	BusinessImplProxy() {
	}

	BusinessImplProxy(Business obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		doBefore();
		result = method.invoke(obj, args);
		obj.bus();
		doAfter();
		return result;
	}

	public void doBefore() {
		System.out.println("do something before Business Logic");
	}

	public void doAfter() {
		System.out.println("do something after Business Logic");
	}

	public static Object factory(Business obj) {
		Class cls = obj.getClass();
		return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new BusinessImplProxy(obj));
	}
}

public class DynamicProxy {

	public static void main(String[] args) throws Throwable {
		BusinessFooImpl bfoo = new BusinessFooImpl();
		BusinessFoo bf = (BusinessFoo) BusinessImplProxy.factory(bfoo);
		bf.foo();
		System.out.println();

		BusinessBarImpl bbar = new BusinessBarImpl();
		BusinessBar bb = (BusinessBar) BusinessImplProxy.factory(bbar);
		String message = bb.bar("Hello,World");
		System.out.println(message);
	}
}