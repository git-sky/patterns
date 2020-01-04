package cn.com.sky.patterns.structural.adapter.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * 缺省适配(Default Adapter)模式或者接口的适配器模式
 *
 * 缺省适配(Default Adapter)模式为一个接口提供缺省实现，这样子类型可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。作为适配器模式的一个特例，缺省是适配模式在JAVA语言中有着特殊的应用。
 *
 *
 * 适用场景：
 * 缺省适配模式为一个接口提供缺省实现，这样了类型可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。
 * 当原接口中定义的方法太多，而其中大部分又不被需要时，这种模式非常实用。由缺省适配器类直接实现接口，并为所有方法提供缺省的空实现。用户类就只需要继承适配器类，只实现感兴趣的方法就行了。
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类，实现所有方法，当我们写别的类的时候，继承抽象类即可。
 *
 *
 *
 * 其实在java API中，如果一个接口中方法多于一个时，就针对该接口提供相应的单接口适配器，如人们熟悉的WindowAdapter、KeyAdapter等。
 *
 * 针对一个接口的单接口适配器就是已经实现了该接口的类，并对接口中的每个方法都给出了一个默认的实现。
 * 比如，java.awt.event包中的MouseAdapter就是MouseListener接口中的单接口适配器，
 * 将MouseListener接口中的五个方法全部实现为不进行任何操作，即这五个方法体中没有任何语句。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
//		Job target = new JobImpl();
//		target.speakEnglish();
//		target.speakFrench();
//		target.speakJapanese();
//		target.speakChinese();
        List<Long> list = new ArrayList();
        list.add(new Long(123L));
        list.add(new Long(456L));
        list.add(new Long(123L));
        System.out.println(list);
    }
}