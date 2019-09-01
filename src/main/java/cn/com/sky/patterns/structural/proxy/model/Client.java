package cn.com.sky.patterns.structural.proxy.model;


public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}