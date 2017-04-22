package cn.com.sky.patterns.behavioral.observer.event_listener.sync;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 首要定义事件源对象（事件源相当于单击按钮事件当中的按钮对象、属于被监听者）。
 */
public class EventSource {

	private Vector<EventListener> vector = new Vector<EventListener>();// 监听自己的监听器队列

	public EventSource() {

	}

	public void addListener(EventListener listener) {
		vector.addElement(listener);
	}

	public void notifyEventObject() {// 通知所有的监听器
		Enumeration<EventListener> e = vector.elements();
		while (e.hasMoreElements()) {
			EventListener listener = e.nextElement();
			listener.handleEvent(new EventObject(this));
		}
	}
}