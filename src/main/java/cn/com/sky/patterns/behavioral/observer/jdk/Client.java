package cn.com.sky.patterns.behavioral.observer.jdk;

/**
 * <pre>
 * 
 * 被观察对象叫做Watched；而观察者对象叫做Watcher。
 * Watched对象继承自java.util.Observable类。
 * Watcher对象实现了java.util.Observer接口。 
 * 另外有一个Client类扮演客户端角色。
 * 
 * Client对象首先创建了Watched和Watcher对象。在创建Watcher对象时，将Watched对象作为参数传入；
 * 然后Test对象调用Watched对象的setData()方法， 触发Watched对象的内部状态变化；
 * Watched对象进而通知实现登记过的Watcher对象，也就是调用它的update()方法。
 * 
 */
public class Client {

	public static void main(String[] args) {

		// 创建被观察者对象
		Watched watched = new Watched();

		// 创建观察者对象，并将被观察者对象登记
		new Watcher(watched);

		// 给被观察者状态赋值
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");

	}

}