package cn.com.sky.patterns.creational.prototype.jdk.low_deep;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            // clone不走构造方法
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
