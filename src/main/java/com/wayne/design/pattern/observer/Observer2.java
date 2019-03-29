package com.wayne.design.pattern.observer;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:45
 */
public class Observer2 implements Observer {

    @Override
    public void watch() {
        System.out.println("Observer2 knows!");
    }
}
