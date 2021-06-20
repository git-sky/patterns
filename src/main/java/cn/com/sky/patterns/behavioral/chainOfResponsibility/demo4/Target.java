package cn.com.sky.patterns.behavioral.chainOfResponsibility.demo4;

public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }

}