package cn.com.sky.patterns.structural.composite.transparent.demo1;

public abstract class Component {

    String name;

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void eachChild();
}