package cn.com.sky.patterns.behavioral.observer.event_listener.sync;

/**
 * 
 * 监听器实现类
 */
public class EventListenerImpl implements EventListener {
	public void handleEvent(EventObject e) {
		System.out.println("EventListenerImpl ...");
		e.say();// 回调
	}
}