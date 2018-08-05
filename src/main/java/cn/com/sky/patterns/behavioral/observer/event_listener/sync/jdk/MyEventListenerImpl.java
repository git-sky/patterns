package cn.com.sky.patterns.behavioral.observer.event_listener.sync.jdk;

/**
 * 监听器实现类
 */
public class MyEventListenerImpl implements MyEventListener {
    @Override
    public void handleEvent(MyEventObject e) {
        System.out.println("EventListenerImpl ...");
        e.say();// 回调
    }
}