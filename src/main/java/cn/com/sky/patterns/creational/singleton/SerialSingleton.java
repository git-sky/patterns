package cn.com.sky.patterns.creational.singleton;

import java.io.Serializable;

/**
 * 如果单例对象可以序列化，要使用readResolve方法，防止通过反序列化获得多例。
 * 
 * 防止序列化破坏单例。
 */
public class SerialSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static SerialSingleton INSTANCE = new SerialSingleton();

	/**
	 * private的构造函数用于避免外界直接使用new来实例化对象
	 */
	private SerialSingleton() {
	}

	public static SerialSingleton getInstance() {
		return INSTANCE;
	}

	private Object readResolve() {
		return getInstance();
	}
}