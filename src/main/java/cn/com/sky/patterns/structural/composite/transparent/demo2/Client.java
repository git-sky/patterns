package cn.com.sky.patterns.structural.composite.transparent.demo2;


/**
 * <pre>
 *
 * 透明式合成模式的结构
 *
 * 与安全式的合成模式不同的是，透明式的合成模式要求所有的具体构件类，不论树枝构件还是树叶构件，均符合一个固定接口。
 *
 * 客户端类的主要变化是不再区分Composite对象和Leaf对象。
 *
 * </pre>
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component leaf1 = new Leaf("衬衫");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}