package cn.com.sky.patterns.behavioral.observer.jdk;

import java.util.Observable;

/**
 * 被观察者
 */
public class Watched extends Observable {

    //内部数据
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        //内部数据变更
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
        }
        //通知所有观察者
        notifyObservers();
    }

}