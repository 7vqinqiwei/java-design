package com.wayne.design.pattern.factory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 11:45
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
