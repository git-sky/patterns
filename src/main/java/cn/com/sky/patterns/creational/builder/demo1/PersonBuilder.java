package cn.com.sky.patterns.creational.builder.demo1;

//Builder接口
public interface PersonBuilder {
	void buildHead();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}