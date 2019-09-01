package cn.com.sky.patterns.creational.abstractFactory.model.productA;

/**
 * 实现了产品标准实现的一系列具体产品
 * 由于已经设计好A1由厂商1生产，故以下输出代码有“厂商x”
 */
public class ProductA1 implements IProductA {
    @Override
    public void method() {
        System.out.println("厂商1 生产ProductA1 ...");
    }
}