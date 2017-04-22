package cn.com.sky.patterns.behavioral.visitor.demo;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}