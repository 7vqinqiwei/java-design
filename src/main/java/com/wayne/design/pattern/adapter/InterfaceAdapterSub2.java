package com.wayne.design.pattern.adapter;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 16:56
 */
public class InterfaceAdapterSub2 extends InterfaceAdapterWrapper {

    @Override
    public void method2() {
        System.out.println("the sub2 interface's method2!");
    }
}
