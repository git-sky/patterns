package cn.com.sky.patterns.creational.singleton.model;

/**
 * 懒汉式单例
 * 
 * 效率很低，因为在99%情况下不需要同步。
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}