package cn.com.sky.patterns.behavioral.visitor.dynamic_double_dispatch;

public abstract class West {
    
    public abstract void goWest1(SubEast1 east);
    
    public abstract void goWest2(SubEast2 east);
}