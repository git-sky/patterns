package cn.com.sky.patterns.creational.builder.demo1.builder;

import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * 具体Builder实现:变异人建造者
 */
public class MutantBuilder implements PersonBuilder {

    private Person person;

    public MutantBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        person.setHead("变异人的头部");
    }

    @Override
    public void buildBody() {
        person.setBody("变异人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("变异人的脚");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}