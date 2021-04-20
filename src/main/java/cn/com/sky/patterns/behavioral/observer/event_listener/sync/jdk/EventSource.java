package cn.com.sky.patterns.behavioral.observer.event_listener.sync.jdk;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 首要定义事件源对象（事件源相当于单击按钮事件当中的按钮对象、属于被监听者）。
 */
public class EventSource {

    /**
     * 监听自己的监听器队列
     */
    private Vector<MyEventListener> vector = new Vector<>();

    public EventSource() {

    }

    public void addListener(MyEventListener listener) {
        vector.addElement(listener);
    }

    public void notifyEventObject() {
        // 通知所有的监听器
        Enumeration<MyEventListener> e = vector.elements();
        while (e.hasMoreElements()) {
            MyEventListener listener = e.nextElement();
            listener.handleEvent(new MyEventObject(this));
        }
    }
}