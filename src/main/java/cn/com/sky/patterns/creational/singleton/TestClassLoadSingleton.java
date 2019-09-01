package cn.com.sky.patterns.creational.singleton;

/**
 * 通过反射构造单例对象 ，如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
 */
public class TestClassLoadSingleton {

    public void test() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}