package com.wayne.design.pattern.abstractfactory;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 13:58
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
