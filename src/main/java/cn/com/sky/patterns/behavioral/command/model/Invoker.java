package cn.com.sky.patterns.behavioral.command.model;

/**
 * 请求者角色(Invoker)
 */
public class Invoker {

	private Command command = null;

	/**
	 * 构造方法
	 */
	public Invoker(Command command) {
		this.command = command;
	}

	/**
	 * 行动方法
	 */
	public void action() {
		command.execute();
	}
}