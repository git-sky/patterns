package cn.com.sky.patterns.behavioral.mediator.model;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	public void operation() {
		// 在需要跟其他同事通信的时候，通知调停者对象
		getMediator().changed(this);
	}
}