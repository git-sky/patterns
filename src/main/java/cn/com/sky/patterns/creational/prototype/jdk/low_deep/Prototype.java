package cn.com.sky.patterns.creational.prototype.jdk.low_deep;

/**
 * <pre>
 *
 * 问题:
 * 当对象的构造函数非常复杂，在生成新对象的时候非常耗时间、耗资源的情况？我们是怎么来创建呢？
 *
 * 解决方案:
 * 通过复制（克隆、拷贝）一个指定类型的对象来创建更多同类型的对象。这个指定的对象可被称为“原型”对象，也就是通过复制原型对象来得到更多同类型的对象。即原型设计模式。
 *
 *  原型模式是一种创建型设计模式,它通过复制一个已经存在的实例来返回新的实例,而不是新建实例.被复制的实例就是我们所称的原型,这个原型是可定制的.
 * 原型模式多用于创建复杂的或者耗时的实例, 因为这种情况下,复制一个已经存在的实例可以使程序运行更高效,或者创建值相等,只是命名不一样的同类数据.
 *
 * </pre>
 */
public class Prototype implements Cloneable {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}