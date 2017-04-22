package cn.com.sky.patterns.behavioral.visitor.dynamic_double_dispatch;

public class SubEast1 extends East{
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }
    
    public String myName1(){
        return "SubEast1";
    }
}