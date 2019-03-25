package com.wayne.design.pattern.factory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 11:45
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
