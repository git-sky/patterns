package cn.com.sky.patterns.behavioral.iterator.model;

//抽象容器
public interface Aggregate {

	public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();

}