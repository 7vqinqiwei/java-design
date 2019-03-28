package com.wayne.design.pattern.adapter;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 16:53
 */
public class InterfaceAdapterSub1 extends InterfaceAdapterWrapper {
    @Override
    public void method1() {
        System.out.println("the sub1 interface's method1!");
    }
}
