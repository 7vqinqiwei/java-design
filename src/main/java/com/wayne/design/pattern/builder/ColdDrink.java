package com.wayne.design.pattern.builder;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 15:50
 */
public abstract class ColdDrink implements Item  {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
