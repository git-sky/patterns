package cn.com.sky.patterns.creational.builder.demo1.builder;

import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * 具体Builder实现:变形金刚建造者
 */
public class TransformerBuilder implements PersonBuilder {

    private Person person;

    public TransformerBuilder() {
        this.person = new Person();
    }

    @Override
    public void buildHead() {
        this.person.setHead("创建 变形金刚 头！");
    }

    @Override
    public void buildBody() {
        this.person.setBody("创建 变形金刚 身体！");
    }

    @Override
    public void buildFoot() {
        this.person.setFoot("创建 变形金刚 脚！");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}