package cn.com.sky.patterns.structural.adapter.clazz;

public class Adapter extends Person implements Job {

	public void speakFrench() {
		System.out.println("I can speak French!");
	}

}
