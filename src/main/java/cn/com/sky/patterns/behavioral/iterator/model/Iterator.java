package cn.com.sky.patterns.behavioral.iterator.model;

//抽象迭代器
public interface Iterator {

	public Object next();

	public boolean hasNext();

}