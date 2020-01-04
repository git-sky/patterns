package cn.com.sky.patterns.behavioral.interpreter;

/**
 * <pre>
 *
 * 一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄.
 *
 *
 * Interpreter: 一个语法解释器的模式。
 * java.util.Pattern
 * java.text.Normalizer
 * java.text.Format
 */
public class Client {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}