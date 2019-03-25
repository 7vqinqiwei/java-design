package com.wayne.design.pattern.builder;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 15:51
 */
public class ChickenBurger extends Burger  {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }

}
