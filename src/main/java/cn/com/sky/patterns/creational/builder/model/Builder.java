package cn.com.sky.patterns.creational.builder.model;

public interface Builder {

	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();
}