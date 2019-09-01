package cn.com.sky.patterns.creational.builder.demo1;


import cn.com.sky.patterns.creational.builder.demo1.builder.HumanBuilder;
import cn.com.sky.patterns.creational.builder.demo1.builder.MutantBuilder;
import cn.com.sky.patterns.creational.builder.demo1.builder.TransformerBuilder;
import cn.com.sky.patterns.creational.builder.demo1.product.Person;

/**
 * <pre>
 *
 * 每一个具体建造者都是相对独立的，不依赖其他的具体建造者，可以方便地替换和增加新的具体建造者，用户使用不同的具体建造者就能得到不同的产品对象。
 *
 * 开闭原则：
 * Person类的各个部分可以有不同的表示，增加一个新的产品表示，增加一个建造者类就可以。
 *
 * 例如：增加一个mutant人，增加一个MutantBuilder就可以了。
 *
 * </pre>
 */
public class Client {
    public static void main(String[] args) {

        PersonDirector director = new PersonDirector();
        Person person = director.constructPerson(new HumanBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
        System.out.println(person);

        Person transformer = director.constructPerson(new TransformerBuilder());
        System.out.println(transformer.getBody());
        System.out.println(transformer.getFoot());
        System.out.println(transformer.getHead());
        System.out.println(transformer);


        Person mutant = director.constructPerson(new MutantBuilder());
        System.out.println(mutant.getBody());
        System.out.println(mutant.getFoot());
        System.out.println(mutant.getHead());
        System.out.println(mutant);

    }
}