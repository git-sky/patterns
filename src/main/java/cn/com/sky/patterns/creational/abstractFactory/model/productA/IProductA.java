package cn.com.sky.patterns.creational.abstractFactory.model.productA;

/**
 * 定义不同的产品之间的一定具备的标准，用interface实现
 * 其中的method()方法可看作提取出不同产品的共性，如手机都有类似的功能
 */
public interface IProductA {
    void method();
}