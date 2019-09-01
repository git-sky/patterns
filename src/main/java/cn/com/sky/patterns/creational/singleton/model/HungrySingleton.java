package cn.com.sky.patterns.creational.singleton.model;

/**
 * 饿汉式单例
 */
public class HungrySingleton {

    /**
     * 类加载时就初始化
     */
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("HungrySingleton()");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    // 执行print()方法也会初始化
    public static HungrySingleton print() {
        System.out.println("print.....");
        return instance;
    }
}