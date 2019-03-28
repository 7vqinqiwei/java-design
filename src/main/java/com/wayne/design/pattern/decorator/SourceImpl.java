package com.wayne.design.pattern.decorator;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 17:35
 */
public class SourceImpl implements Sourceable {

    @Override
    public void method() {
        System.out.println("the Source method!");
    }
}
