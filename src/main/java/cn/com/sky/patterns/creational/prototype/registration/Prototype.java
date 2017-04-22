package cn.com.sky.patterns.creational.prototype.registration;

public interface Prototype {

	public Prototype clone();

	public String getName();

	public void setName(String name);
}