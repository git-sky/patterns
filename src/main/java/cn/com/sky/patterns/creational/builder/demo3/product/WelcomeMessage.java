package cn.com.sky.patterns.creational.builder.demo3.product;

/**
 * 具体产品类WelcomeMessage
 */
public class WelcomeMessage extends AutoMessage {
    /**
     * 构造子
     */
    public WelcomeMessage() {
        System.out.println("发送欢迎信息");
    }
}