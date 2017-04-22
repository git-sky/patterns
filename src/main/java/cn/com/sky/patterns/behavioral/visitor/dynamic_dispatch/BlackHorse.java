package cn.com.sky.patterns.behavioral.visitor.dynamic_dispatch;

public class BlackHorse extends Horse {
    
    @Override
    public void eat() {
        System.out.println("黑马吃草");
    }
}