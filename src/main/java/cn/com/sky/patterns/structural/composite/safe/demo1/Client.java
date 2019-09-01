package cn.com.sky.patterns.structural.composite.safe.demo1;


/**
 * <pre>
 * 安全式合成模式的结构
 *
 * 这样的做法是安全的做法，由于这个特点，客户端应用程序不可能错误地调用树叶构件的聚集方法，因为树叶构件没有这些方法，调用会导致编译错误。
 *
 * 安全式合成模式的缺点是不够透明，因为树叶类和树枝类将具有不同的接口。
 *
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");

        Leaf leaf1 = new Leaf("衬衫");
        Leaf leaf2 = new Leaf("夹克");
        Leaf leaf3 = new Leaf("裙子");
        Leaf leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}