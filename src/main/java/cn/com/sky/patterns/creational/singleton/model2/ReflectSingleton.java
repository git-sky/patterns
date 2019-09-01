package cn.com.sky.patterns.creational.singleton.model2;

/**
 * 防止反射破坏单例。
 */
public class ReflectSingleton {

	private static boolean flag = false;

	private ReflectSingleton() {
		synchronized (ReflectSingleton.class) {
			if (flag == false) {
				flag = !flag;
			} else {
				throw new RuntimeException("单例只能有一个!!!");
			}
		}
	}

	private static class SingletonHolder {
		private static final ReflectSingleton INSTANCE = new ReflectSingleton();
	}

	public static ReflectSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}