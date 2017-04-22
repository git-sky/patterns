package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo1;

/**
 * 测试类
 * 
 */
public class Client {

	public static void main(String[] args) {
		// 绑定代理，这种方式会在所有的方法都加上切面方法
		ITalk iTalk = (ITalk) new TalkProxy().bind(new TalkImpl("tony", "16"));
		iTalk.talk("talk");
	}
}