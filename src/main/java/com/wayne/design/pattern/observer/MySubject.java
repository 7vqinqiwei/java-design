package com.wayne.design.pattern.observer;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:49
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("MySubject operation!");
        notifyObservers();
    }
}
