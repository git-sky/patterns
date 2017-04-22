package cn.com.sky.patterns.behavioral.memento.whiteBox;

/**
 * <pre>
 * 
 * 备忘录（Memento）模式
 * 
 * 备忘录模式又叫做快照模式(Snapshot Pattern)或Token模式，是对象的行为模式。
 * 
 * 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，
 * 从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
 * 
 * 备忘录模式所涉及的角色有三个：备忘录(Memento)角色、发起人(Originator)角色、负责人(Caretaker)角色。
 * 
 * 备忘录模式的角色：
 * （1）发起人（Originator）：要被备份的成员，它提供一创建备忘录的方法，其实就是将它自身的某些信息拷贝一份到一个备忘录对象中。并提供另外一个方法将备忘录中的信息覆盖自身的信息。
 * （2）备忘录（Memento）：备忘录对象中包含存储发起人状态的成员变量，它提供set，get或构造方法保存发起人状态及获取发起人状态。
 * （3）管理角色（Caretaker）：用于管理备忘录对象的实现类。
 * 
 * 
 * Memento:
 * 给一个对象的状态做一个快照。Date类在内部使用了一个long型来做这个快照。
 * java.util.Date
 * java.io.Serializable
 * 
 */
public class Client {

	public static void main(String[] args) {

		Originator o = new Originator();
		Caretaker c = new Caretaker();
		// 改变负责人对象的状态
		o.setState("On");
		// 创建备忘录对象，并将发起人对象的状态储存起来
		c.saveMemento(o.createMemento());
		// 修改发起人的状态
		o.setState("Off");
		// 恢复发起人对象的状态
		o.restoreMemento(c.retrieveMemento());

		System.out.println(o.getState());
	}

}