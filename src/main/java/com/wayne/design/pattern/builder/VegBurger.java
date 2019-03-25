package com.wayne.design.pattern.builder;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 15:51
 */
public class VegBurger extends Burger  {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
