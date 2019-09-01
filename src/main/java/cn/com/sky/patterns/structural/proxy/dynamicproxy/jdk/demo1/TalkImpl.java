package cn.com.sky.patterns.structural.proxy.dynamicproxy.jdk.demo1;

/**
 * 真实主题角色：定义真实的对象。
 */
public class TalkImpl implements ITalk {

    public String username;
    public String age;

    public TalkImpl(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public TalkImpl() {
    }

    @Override
    public void talk(String msg) {
        System.out.println(msg + "! 你好,我是" + username + "，我年龄是" + age);
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}