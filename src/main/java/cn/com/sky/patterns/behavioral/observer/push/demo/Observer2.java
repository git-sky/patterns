package cn.com.sky.patterns.behavioral.observer.push.demo;

public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}