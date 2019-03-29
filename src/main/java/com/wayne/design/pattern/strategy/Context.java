package com.wayne.design.pattern.strategy;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 17:29
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //策略模式就是使用一个抽象的字类方法执行
    //只要传入的策略变化而这里无需任何变更
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }

}
