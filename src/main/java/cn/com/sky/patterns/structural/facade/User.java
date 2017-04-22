package cn.com.sky.patterns.structural.facade;

/**
 * <pre>
 * 
 * Façade模式/门面模式
 * 
 * 注意区分Façade模式、Adapter模式、Bridge模式与Decorator模式:
 * Façade模式注重简化接口
 * Adapter模式注重转换接口
 * Bridge模式注重分离接口（抽象）与其实现
 * Decorator模式注重稳定接口的前提下为对象扩展功能
 * 
 */
public class User {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}