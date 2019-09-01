package cn.com.sky.patterns.creational.builder.model;

public interface Builder {

    void buildPart1();

    void buildPart2();

    /**
     * 结果返还方法
     */
    Product retrieveResult();
}