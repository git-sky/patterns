package cn.com.sky.patterns.creational.builder.demo2;

public class Client {

    public static void main(String[] args) {
        Race race = new RaceBuilder().builder().setName("张三").setSex("男").setSkinColor("白色").create();
        System.out.println(race);


        Race race2 = new RaceBuilder().builder().setName("李四").setSex("女").setSkinColor("黑色").create();
        System.out.println(race2);
    }

}