package cn.com.sky.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlavorFactory {

    private Map<String, Order> flavorPool = new HashMap<>();

    // 静态工厂,负责生成订单对象
    private static FlavorFactory flavorFactory = new FlavorFactory();

    private FlavorFactory() {
    }

    public static FlavorFactory getInstance() {
        return flavorFactory;
    }

    public Order getOrder(String flavor) {
        Order order = null;

        // 如果此映射包含指定键的映射关系，则返回 true
        if (flavorPool.containsKey(flavor)) {
            order = flavorPool.get(flavor);
        } else {
            order = new FlavorOrder(flavor);
            flavorPool.put(flavor, order);
        }
        return order;
    }

    public int getTotalFlavorsMade() {
        return flavorPool.size();
    }
}
