package cn.com.sky.patterns.creational.builder.demo1;


public class Client {
	public static void main(String[] args) {
		
		PersonDirector pd = new PersonDirector();
		Person person = pd.constructPerson(new HumanBuilder());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
		System.out.println(person.getHead() + " \n");
		
		Person transformer = pd.constructPerson(new TransformerBuilder());
		System.out.println(transformer.getBody());
		System.out.println(transformer.getFoot());
		System.out.println(transformer.getHead());
	}
}