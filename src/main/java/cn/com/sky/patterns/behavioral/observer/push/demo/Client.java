package cn.com.sky.patterns.behavioral.observer.push.demo;

public class Client {

    public static void main(String[] args) {

        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}