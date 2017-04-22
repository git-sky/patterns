package cn.com.sky.patterns.behavioral.interpreter.demo;

/**
 * <pre>
 * 
 * 解释器模式所涉及的角色如下所示：
 *   
 * 抽象表达式(Expression)角色：声明一个所有的具体表达式角色都需要实现的抽象接口。这个接口主要是一个interpret()方法，称做解释操作。
 *   
 * 终结符表达式(Terminal Expression)角色：实现了抽象表达式角色所要求的接口，主要是一个interpret()方法；文法中的每一个终结符都有一个具体终结表达式与之相对应。比如有一个简单的公式R=R1+R2，在里面R1和R2就是终结符，对应的解析R1和R2的解释器就是终结符表达式。
 *   
 * 非终结符表达式(Nonterminal Expression)角色：文法中的每一条规则都需要一个具体的非终结符表达式，非终结符表达式一般是文法中的运算符或者其他关键字，比如公式R=R1+R2中，“+"就是非终结符，解析“+”的解释器就是一个非终结符表达式。
 *   
 * 环境(Context)角色：这个角色的任务一般是用来存放文法中各个终结符所对应的具体值，比如R=R1+R2，我们给R1赋值100，给R2赋值200。这些信息需要存放到环境角色中，很多情况下我们使用Map来充当环境角色就足够了。
 *   
 *   
 * 优点： 
 *   解释器是一个简单语法分析工具，它最显著的优点就是扩展性，修改语法规则只要修改相应的非终结符表达式就可以了，若扩展语法，则只要增加非终结符类就可以了。
 *   
 * 缺点： 
 *   解释器模式会引起类膨胀，每个语法都要产生一个非终结符表达式，语法规则比较复杂时，可能产生大量的类文件，难以维护。
 *   解释器模式采用递归调用方法，它导致调试非常复杂。
 *   解释器由于使用了大量的循环和递归，所以当用于解析复杂、冗长的语法时，效率是难以忍受的 。
 * 
 * 注意事项： 尽量不要在重要模块中使用解释器模式，因为维护困难。在项目中，可以使用shell,JRuby,Groovy等脚本语言来代替解释器模式。
 * 
 */

public class Client {
	// (a*b)/(a-b+2)
	public static void main(final String[] args) {
		final Context context = new Context();
		context.addValue("a", 7);
		context.addValue("b", 8);
		context.addValue("c", 2);

		final MultiplyNonterminalExpression multiplyValue = new MultiplyNonterminalExpression(new TerminalExpression(context.getValue("a")), new TerminalExpression(
				context.getValue("b")));

		final SubtractNonterminalExpression subtractValue = new SubtractNonterminalExpression(new TerminalExpression(context.getValue("a")), new TerminalExpression(
				context.getValue("b")));

		final AddNonterminalExpression addValue = new AddNonterminalExpression(subtractValue, new TerminalExpression(context.getValue("c")));

		final DivisionNonterminalExpression divisionValue = new DivisionNonterminalExpression(multiplyValue, addValue);

		System.out.println(divisionValue.interpreter(context));
	}
}