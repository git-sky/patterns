package cn.com.sky.patterns.creational.builder.demo1;

//Director构建向导
public class PersonDirector {

	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
