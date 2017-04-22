package cn.com.sky.patterns.creational.singleton;

/**
 * 
 * 防止多个不同的类加载器加载同一个类导致的多例。
 */
public class ClassLoadSingleton {

	private static Class getClass(String classname) throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		if (classLoader == null)
			classLoader = Singleton.class.getClassLoader();

		System.out.println("classLoader:" + classLoader);

		return (classLoader.loadClass(classname));
	}

	// 类加载时就初始化
	private static final ClassLoadSingleton instance = new ClassLoadSingleton();

	private ClassLoadSingleton() {
	}

	public static ClassLoadSingleton getInstance() {
		return instance;
	}

}