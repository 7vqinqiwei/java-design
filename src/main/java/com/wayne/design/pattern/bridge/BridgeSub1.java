package com.wayne.design.pattern.bridge;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:44
 */
public class BridgeSub1 implements Bridgeable {
    @Override
    public void method() {
        System.out.println("this is the sub1 method!");
    }
}
