package cn.com.sky.patterns.creational.singleton.model2;

/**
 * <pre>
 *
 * 静态内部类实现单例模式。
 *
 * 使用JVM本身机制保证了线程安全问题。
 *
 * 既实现了线程安全，又避免了同步带来的性能影响。
 *
 * 原因参见： http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization/
 *
 * </pre>
 */
public class InternalSingleton {

    /* 私有构造方法，防止被实例化 */
    private InternalSingleton() {
        System.out.println("InternalSingleton()...");
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    /* 此处使用一个内部类来维护单例 */
    private static class SingletonHolder {
        {
            System.out.println("bxxx");
        }

        static {
            System.out.println("aaaaaaaaa");
        }

        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static InternalSingleton instance = new InternalSingleton();
    }

    /* 获取实例 */
    public static InternalSingleton getInstance() {
        return SingletonHolder.instance;
//        return null;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    // public Object readResolve() {
    // return getInstance();
    // }
}