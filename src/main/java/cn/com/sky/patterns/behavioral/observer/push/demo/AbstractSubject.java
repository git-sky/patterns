package cn.com.sky.patterns.behavioral.observer.push.demo;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            Observer observer = enumo.nextElement();
            observer.update();
        }
    }
}