package cn.com.sky.patterns.structural.proxy.staticproxy.demo2;

public class HelloServiceProxy implements HelloService {

    // 被代理对象
    private HelloService helloService;

    public HelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    public void setHelloServiceProxy(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String say(String s) {
        before();
        // 调用被代理对象的方法
        String result = helloService.say(s);
        after();
        return result;
    }

    private void before() {
        System.out.println("before say()....");
    }

    private void after() {
        System.out.println("after say()....");
    }

}