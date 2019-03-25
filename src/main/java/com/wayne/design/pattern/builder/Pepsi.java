package com.wayne.design.pattern.builder;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 15:52
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }

}
