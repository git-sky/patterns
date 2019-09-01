package cn.com.sky.patterns.creational.builder.demo3.builder;

import cn.com.sky.patterns.creational.builder.demo3.product.WelcomeMessage;

/**
 * 具体建造者WelcomeBuilder
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildBody() {
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢迎标题");
    }

}