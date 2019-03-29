package com.wayne.design.pattern.observer;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:44
 */
public class Observer1 implements Observer {

    @Override
    public void watch() {
        System.out.println("Observer1 knows!");
    }
}
