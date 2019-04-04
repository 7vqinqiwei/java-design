package com.wayne.design.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:47
 */
public abstract class AbstractSubject implements Subject{

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
        while(enumo.hasMoreElements()){
            enumo.nextElement().watch();
        }
    }

}
