package cn.com.sky.patterns.structural.decorator.demo3;

public class Employe implements Project{ 
    /** 
     * 编码 
     */ 
	@Override
    public void doCoding(){ 
        System.out.println("代码工人 在编写代码，加班编啊编啊，终于编完了！"); 
    } 
}