package cn.com.sky.patterns.creational.builder.demo3.product;

/**
 * 具体产品类GoodbyeMessage
 */
public class GoodbyeMessage extends AutoMessage {
    /**
     * 构造子
     */
    public GoodbyeMessage() {
        System.out.println("发送欢送信息");
    }
}