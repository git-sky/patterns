package cn.com.sky.patterns.creational.builder.demo1.builder;

import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * 具体Builder实现:普通人类建造者
 */
public class HumanBuilder implements PersonBuilder {

    private Person person;

    public HumanBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildBody() {
        this.person.setBody("创建 人类 身体！");
    }

    @Override
    public void buildFoot() {
        this.person.setFoot("创建 人类 脚！");
    }

    @Override
    public void buildHead() {
        this.person.setHead("创建 人类 头！");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
