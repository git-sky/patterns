package cn.com.sky.patterns.structural.bridge.model;

import cn.com.sky.patterns.structural.bridge.model.abstraction.Abstraction;
import cn.com.sky.patterns.structural.bridge.model.abstraction.RefinedAbstraction;
import cn.com.sky.patterns.structural.bridge.model.implement.ConcreteImplementorB;
import cn.com.sky.patterns.structural.bridge.model.implement.Implementor;

/**
 * <pre>
 * Bridge模式(桥接模式)，桥梁模式【GOF95】是对象的结构模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * 
 * 
 * 桥梁模式的系统中有两个等级结构：
 * 
 * 由抽象化角色和修正抽象化角色组成的抽象化等级结构。
 * 由实现化角色和具体实现化角色所组成的实现化等级结构。
 * 抽象化等级结构是提供给用户或者系统其它部分使用的，是稳定不易变的；而实现化等级结构是可以替换的，比如在不同的环境中，使用不同的实现化，这也正是解耦合的目标。
 * 
 * 
 * 适用场景：
 * 
 * 桥梁模式的意图在于把“抽象”与“实现”解耦合，把强关联转变为弱关联。
 * 
 * 所谓强关联，就是在编译时期已经确定的，无法在运行时期改变的关联；所谓弱关联，就是可以动态地确定并且可以在运行时期动态地改变的关联。显然，在Java语言中，继承关系是强关联，而聚合关系是弱关联。
 * 
 * 将两个角色之间的继承关系改为聚合关系，就是将它们之间的强关联改为弱关联。因此，桥梁模式中的所谓解耦合，就是指在一个软件系统的抽象化和实现化之间使用聚合关系而不是继承关系，从而使两者都可以相对独立地变化。
 * 
 * 
 * 
 * 桥梁模式所涉及的角色有：
 * 
 * 抽象化(Abstraction)角色：抽象化给出的定义，并保存一个对实现化对象的引用。
 * 修正抽象化(Refined Abstraction)角色：扩展抽象化角色，改变和修正父类对抽象化的定义。
 * 实现化(Implementor)角色：这个角色给出实现化角色的接口，但不给出具体的实现。必须指出的是，这个接口不一定和抽象化角色的接口定义相同，实际上，这两个接口可以非常不一样。实现化角色应当只给出底层操作，而抽象化角色应当只给出基于底层操作的更高一层的操作。
 * 具体实现化(Concrete Implementor)角色：这个角色给出实现化角色接口的具体实现。
 * 
 * 
 * 思路简单理解就是：
 * 在类中抽离方法形成另一个类。比如对于“动物”，有“行走”功能。
 * 一般我们设计时，把"动物"设计成一个类，里面有方法“行走”。
 * 那么Bridge模式就是把“行走”方法从“动物”类中抽离出来，形成“行走”类，并在“动物”类中使用这个“行走”对象，实现行走功能。
 * 这样，“动物”类和“行走”类都可以独立变化。
 * 
 */
public class Client {

	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		// Implementor imp = new ConcreteImplementorA();
		Implementor imp = new ConcreteImplementorB();
		ab.setImp(imp);
		ab.operation();
	}

}
