package cn.com.sky.patterns.creational.builder.model_variant;

/**
 * 省略抽象建造者角色，省略导演者角色
 */
public class Client {

    private static Builder builder;

    public static void main(String[] args) {
        //创建建造者对象
        builder = new Builder();
        //调用建造者对象的产品构造方法
        builder.construct();

        //返还产品
        Product product = builder.retrieveResult();

        System.out.println(product);
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());


    }
}