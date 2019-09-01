package cn.com.sky.patterns.creational.builder.demo1;

import cn.com.sky.patterns.creational.builder.demo1.builder.PersonBuilder;
import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * 构建向导Director
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
