package cn.com.sky.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 * flyweight模式/享元模式:类似于对象池，数据库连接池
 *
 *
 * 享元模式是对象的结构模式。享元模式以共享的方式高效地支持大量的细粒度对象。
 *
 * 在JAVA语言中，String类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。在JAVA中字符串常量都是存在常量池中的，
 * JAVA会确保一个字符串常量在常量池中只有一个拷贝。String a="abc"，其中"abc"就是一个字符串常量。
 */
public class Client {

    // 客户下的订单
    private static List<Order> orders = new ArrayList<>();
    // 订单对象生成工厂
    private static FlavorFactory flavorFactory;

    // 增加订单
    private static void takeOrders(String flavor) {
        orders.add(flavorFactory.getOrder(flavor));
    }

    public static void main(String[] args) {
        // 订单生成工厂
        flavorFactory = FlavorFactory.getInstance();

        // 增加订单
        takeOrders("摩卡");
        takeOrders("卡布奇诺");
        takeOrders("香草星冰乐");
        takeOrders("香草星冰乐");
        takeOrders("拿铁");
        takeOrders("卡布奇诺");
        takeOrders("拿铁");
        takeOrders("卡布奇诺");
        takeOrders("摩卡");
        takeOrders("香草星冰乐");
        takeOrders("卡布奇诺");
        takeOrders("摩卡");
        takeOrders("香草星冰乐");
        takeOrders("拿铁");
        takeOrders("拿铁");

        // 卖咖啡
        for (Order order : orders) {
            order.sell();
        }

        // 打印生成的订单java对象数量
        System.out.println("\n客户一共买了 " + orders.size() + " 杯咖啡! ");

        // 打印生成的订单java对象数量
        System.out.println("共生成了 " + flavorFactory.getTotalFlavorsMade() + " 个 FlavorOrder java对象! ");
    }
}