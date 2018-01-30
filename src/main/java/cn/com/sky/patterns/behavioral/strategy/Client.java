package cn.com.sky.patterns.behavioral.strategy;

/**
 * <pre>
 * 
 * 策略模式：定义一系列的算法,把每一个算法封装起来, 并且使它们可相互替换。
 * 
 * 模式的组成 
 * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
 * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 * 
 * 
 * 状态模式与策略模式的区别
 * 
 * 区别：
 * 状态模式将各个状态所对应的操作分离开来，即对于不同的状态，由不同的子类实现具体操作，不同状态的切换由子类实现，当发现传入参数不是自己这个状态所对应的参数，则自己给Context类切换状态；
 * 
 * 而策略模式是直接依赖注入到Context类的参数进行选择策略，不存在切换状态的操作。
 * 
 * 联系：
 * 状态模式和策略模式都是为具有多种可能情形设计的模式，把不同的处理情形抽象为一个相同的接口，符合对扩展开放，对修改封闭的原则。
 * 
 * 
 *
 */
public class Client {

	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
		MemberStrategy strategy = new AdvancedMemberStrategy();
		// 创建环境
		PriceContext price = new PriceContext(strategy);
		// 计算价格
		double quote = price.quote(300);
		System.out.println("图书的最终价格为：" + quote);
	}

}