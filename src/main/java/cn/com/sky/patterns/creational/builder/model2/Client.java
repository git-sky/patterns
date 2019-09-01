package cn.com.sky.patterns.creational.builder.model2;

/**
 * <pre>
 * 多产品类情况
 *
 * 虽然在这个例子里面各个产品类均有一个共同的接口，但这仅仅是本例子特有的，并不代表建造模式的特点。
 * 建造模式可以应用到具有完全不同接口的产品类上。
 * 大多数情况下是不知道最终构建出来的产品是什么样的，所以在标准的建造模式里面，一般是不需要对产品定义抽象接口的，
 * 因为最终构造的产品千差万别，给这些产品定义公共接口几乎是没有意义的。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product);
    }
}