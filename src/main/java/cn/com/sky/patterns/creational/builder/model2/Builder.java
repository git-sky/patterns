package cn.com.sky.patterns.creational.builder.model2;

public interface Builder {

    void buildPart1();

    void buildPart2();

    /**
     * 结果返还方法
     *
     * @return
     */
    Product retrieveResult();
}