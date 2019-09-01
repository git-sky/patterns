package cn.com.sky.patterns.structural.flyweight;

public class FlavorOrder extends Order {

    private String flavor;

    // 获取咖啡口味
    public FlavorOrder(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void sell() {
        System.out.println("卖出一份" + flavor + "的咖啡。");
    }
}
