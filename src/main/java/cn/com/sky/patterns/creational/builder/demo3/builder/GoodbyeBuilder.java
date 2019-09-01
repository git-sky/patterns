package cn.com.sky.patterns.creational.builder.demo3.builder;

import cn.com.sky.patterns.creational.builder.demo3.product.GoodbyeMessage;

/**
 * 具体建造者GoodbyeBuilder
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildBody() {
        msg.setBody("欢送内容");
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢送标题");
    }

}