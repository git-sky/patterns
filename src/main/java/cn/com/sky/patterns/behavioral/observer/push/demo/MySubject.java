package cn.com.sky.patterns.behavioral.observer.push.demo;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}