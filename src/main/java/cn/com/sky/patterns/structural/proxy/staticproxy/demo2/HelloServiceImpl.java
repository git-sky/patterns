package cn.com.sky.patterns.structural.proxy.staticproxy.demo2;

public class HelloServiceImpl implements HelloService {

    @Override
    public String say(String s) {
        System.out.println("say:" + s);
        return "say:" + s;
    }

}