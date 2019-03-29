package com.wayne.design.pattern.bridge;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 11:44
 */
public class BridgeSub2 implements Bridgeable {

    @Override
    public void method() {
        System.out.println("this is the sub2 method!");
    }
}
