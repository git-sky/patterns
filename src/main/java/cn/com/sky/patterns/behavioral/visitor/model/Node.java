package cn.com.sky.patterns.behavioral.visitor.model;

public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}