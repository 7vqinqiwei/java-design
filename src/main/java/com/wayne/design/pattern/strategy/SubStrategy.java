package com.wayne.design.pattern.strategy;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:29
 */
public class SubStrategy implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
