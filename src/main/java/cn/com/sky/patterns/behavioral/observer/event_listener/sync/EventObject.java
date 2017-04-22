package cn.com.sky.patterns.behavioral.observer.event_listener.sync;

/**
 * 2、其次定义事件（状态）对象（该事件对象包装了事件源对象、作为参数传递给监听器、很薄的一层包装类）。
 */
public class EventObject extends java.util.EventObject {

	private static final long serialVersionUID = 1L;

	public EventObject(Object source) {
		super(source);// source—事件源对象—如在界面上发生的点击按钮事件中的按钮
		// 所有 Event 在构造时都引用了对象 "source"，在逻辑上认为该对象是最初发生有关 Event 的对象
	}

	public void say() {
		System.out.println("This is say method...");
	}
}