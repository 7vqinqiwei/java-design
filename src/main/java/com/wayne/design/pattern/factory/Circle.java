package com.wayne.design.pattern.factory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 11:46
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
