package cn.com.sky.patterns.creational.prototype.registration;

public interface Prototype {

    Prototype clone();

    String getName();

    void setName(String name);
}