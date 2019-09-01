package cn.com.sky.patterns.creational.builder.demo1.product;

/**
 * 具体产品：人
 */
public class Person {

    private String head;
    private String body;
    private String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }
}
