package cn.com.sky.patterns.behavioral.observer.event_listener.sync;

/**
 * <pre>
 * 
 * 事件/监听器模式：事件源经过事件的封装传给监听器，当事件源触发事件后，监听器接收到事件对象可以回调事件的方法 。
 * 
 * 事件监听模式其实就是一种观察者模式，只是角度有点不同，在Java的JavaBean机制以及GUI中都使用了事件监听模式。在如今AJAX RIA客户端中，事件监听模式也成为一个主要的界面模式。
 * 
 * 
 * 事件监听模式分同步和异步两种实现方式，JavaBean机制和GUI基本都是同步机制，事件监听异步模型，需要引入Event Queue。
 * 
 * 
 * 同步模式
 * 事件监听同步模式分两个部分：Event Source和Event Listener：
 * Event Source：被监听者的事件集合，可能是方法，提供事件的注册加入和移除功能。类似被观察者的集合。
 * Event Listener：事件的监听者，当事件被触发，所有监听这个事件的监听者将被通知，然后执行自己的Action响应动作。
 * 
 * 异步模式
 * 事件监听异步模式在Source和Listener之间引入event queue，
 * event queue是一个基于事件的publish-subscribe. 它一种松耦合方式提供不同模块和角色之间异步通讯。它比同步更加松耦合，这样，我们就把Source-Listener改成了publish-queue-subscribe方式。
 * 事件监听模式使用在客户端RIA比较多，因为这里是用户输入的源头，是事件发生的源头。而且在目前WOA趋势下，事件监听模式不能只单独局限于RIA客户端这个范围，还需要把事件通过http形式传递到服务器端，也就是跨客户端和服务器的，事件必须和服务器的PUSH异步结合在一起。这是一种先进的架构设计。
 * 订阅发布者模式有时也称为观察者模式。
 * 
 * 以下是同步模式:
 * 
 * </pre>
 */
public class Client {

	EventSource es;

	public Client() {
		try {
			es = new EventSource();
			// 将监听器在事件源对象中登记：
			EventListenerImpl listener1 = new EventListenerImpl();
			es.addListener(listener1);
			es.addListener(new EventListener() {
				public void handleEvent(EventObject event) {
					System.out.println("Method come from 匿名类...");
				}
			});
			es.notifyEventObject();// 触发事件、通知监听器
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new Client();
	}
}