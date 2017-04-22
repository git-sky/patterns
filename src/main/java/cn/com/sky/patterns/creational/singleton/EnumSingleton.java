package cn.com.sky.patterns.creational.singleton;

import java.io.Serializable;

/**
 * <pre>
 * 默认枚举实例的创建是线程安全的，所以不需要担心线程安全的问题。
 * 
 * 单元素的枚举类型已经成为实现Singleton模式的最佳方法。
 * 
 * 1.防止序列化破坏单例。
 *    enum在被序列化时时经过特殊处理的, 被序列化的仅仅是枚举的名字而已。
 *    序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象。
 * 2.防止反射破坏单例。
 * 
 * 3.保证单例线程安全。
 * 关于线程安全的保证，其实是通过类加载机制来保证的，我们看看INSTANCE的实例化时机，是在static块中，JVM加载类的过程显然是线程安全的。
 * 属性都是static类型的，因为static类型的属性会在类被加载之后被初始化，当一个Java类第一次被真正使用到的时候静态资源被初始化、Java类的加载和初始化过程都是线程安全的。所以，创建一个enum类型是线程安全的。
 */
public enum EnumSingleton implements Serializable {
	INSTANCE;

}