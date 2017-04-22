package cn.com.sky.patterns.behavioral.memento.historyOnSelf;

/**
 * <pre>
 * 
 * “自述历史”模式
 * 所谓“自述历史”模式(History-On-Self Pattern)实际上就是备忘录模式的一个变种。
 * 在备忘录模式中，发起人(Originator)角色、负责人(Caretaker)角色和备忘录(Memento)角色都是独立的角色。
 * 虽然在实现上备忘录类可以成为发起人类的内部成员类，但是备忘录类仍然保持作为一个角色的独立意义。
 * 在“自述历史”模式里面，发起人角色自己兼任负责人角色。
 * 
 * 
 * 由于“自述历史”作为一个备忘录模式的特殊实现形式非常简单易懂，它可能是备忘录模式最为流行的实现形式。
 * 
 */
public class Client {

	public static void main(String[] args) {
		Originator o = new Originator();
		// 修改状态
		o.changeState("state 0");
		// 创建备忘录
		MementoIF memento = o.createMemento();
		// 修改状态
		o.changeState("state 1");
		// 按照备忘录恢复对象的状态
		o.restoreMemento(memento);
	}

}