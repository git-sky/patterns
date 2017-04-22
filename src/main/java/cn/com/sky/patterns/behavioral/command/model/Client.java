package cn.com.sky.patterns.behavioral.command.model;

/**
 * <pre>
 * 
 * 命令模式又称为行动(Action)模式或交易(Transaction)模式。
 * 
 * 命令模式是对命令的封装。命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象。
 * 
 * 每一个命令都是一个操作：请求的一方发出请求要求执行一个操作；接收的一方收到请求，并执行操作。
 * 命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求是怎么被接收，以及操作是否被执行、何时被执行，以及是怎么被执行的。
 * 
 * 
 * 
 * 命令模式涉及到五个角色，它们分别是：
 * 客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者。
 * 命令(Command)角色：声明了一个给所有具体命令类的抽象接口。
 * 具体命令(ConcreteCommand)角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
 * 请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。
 * 接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 * 
 * 
 * 
 * 
 * </pre>
 *
 */
public class Client {

	public static void main(String[] args) {
		// 创建接收者
		Receiver receiver = new Receiver();
		// 创建命令对象，设定它的接收者
		Command command = new ConcreteCommand(receiver);
		// 创建请求者，把命令对象设置进去
		Invoker invoker = new Invoker(command);
		// 执行方法
		invoker.action();
	}

}