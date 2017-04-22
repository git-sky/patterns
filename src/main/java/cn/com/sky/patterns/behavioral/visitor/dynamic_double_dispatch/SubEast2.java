package cn.com.sky.patterns.behavioral.visitor.dynamic_double_dispatch;

public class SubEast2 extends East{
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }
    
    public String myName2(){
        return "SubEast2";
    }
}