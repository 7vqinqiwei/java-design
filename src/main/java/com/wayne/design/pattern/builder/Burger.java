package com.wayne.design.pattern.builder;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 15:50
 */
public abstract class Burger implements Item  {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
