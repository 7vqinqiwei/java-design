package com.wayne.design.pattern.proxy;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 10:14
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the Source method!");
    }
}
