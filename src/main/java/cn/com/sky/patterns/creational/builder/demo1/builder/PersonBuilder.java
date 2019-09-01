package cn.com.sky.patterns.creational.builder.demo1.builder;

import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * Builder接口
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}