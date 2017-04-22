package cn.com.sky.patterns.creational.singleton;

/**
 * 双重检测加锁DCL
 */
public class DoubleCheckSingleton {

	/** volatile是重点 ,JDK1.5增强了volatile语义之后，该方式变得有效。 */
	private volatile static DoubleCheckSingleton instance = null;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					/**
					 * <pre>
					 * instance = new DoubleCheckSingleton();
					 * 这一行代码可以分解为如下的三行伪代码：
					 * memory = allocate(); // 1：分配对象的内存空间
					 * ctorInstance(memory); // 2：初始化对象
					 * instance = memory; //3：设置instance指向刚分配的内存地址
					 * 
					 * volatile可以禁止2和3的重排序。从而保证DCL有效。
					 */
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		DoubleCheckSingleton dc = getInstance();
	}
}