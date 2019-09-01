package cn.com.sky.patterns.structural.adapter.clazz;

/**
 * <pre>
 *
 *
 *
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 *
 * 适配器模式不适合在详细设计阶段使用，它是一种补偿模式，专用来在系统后期扩展、修改时所用。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Job target = new Adapter();
        target.speakEnglish();
        target.speakFrench();
        target.speakJapanese();
    }
}