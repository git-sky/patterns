package cn.com.sky.patterns.behavioral.chainOfResponsibility.model;

/**
 * <pre>
 * 
 * 责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
 * 但是发出者并不清楚到底最终那个对象会处理该请求 ，所以， 责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。
 * 
 * 链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，
 * 同时，在一个时刻，命令只允许由一个对象传给另一个对象， 而不允许传给多个对象。
 *   
 *   
 * Chain of responsibility:
 * 把一个对象在一个链接传递直到被处理。在这个链上的所有的对象有相同的接口（抽象类）但却有不同的实现。
 * java.util.logging.Logger#log()
 * javax.servlet.Filter#doFilter()
 *   
 * Tomcat中的Filter就是使用了责任链模式。
 * 
 * </pre>
 */
public class Client {

	public static void main(String[] args) {
		Handler h1 = new ConcreteHandler("h1");
		Handler h2 = new ConcreteHandler("h2");
		Handler h3 = new ConcreteHandler("h3");

		h1.setHandler(h2);
		h2.setHandler(h3);

		h1.handleRequest();
	}
}