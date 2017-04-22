package cn.com.sky.patterns.behavioral.observer.push.demo;

public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}