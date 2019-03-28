package com.wayne.design.pattern.decorator;

/**
 * @Author: waynechin
 * @Date: 2019/3/28 17:36
 */
public class Decorator implements Sourceable {

    private Sourceable souurce;

    public Decorator(Sourceable souurce){
        super();
        this.souurce = souurce;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        souurce.method();
        System.out.println("after decorator!");
    }
}
