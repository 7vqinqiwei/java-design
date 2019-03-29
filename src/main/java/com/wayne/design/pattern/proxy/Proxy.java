package com.wayne.design.pattern.proxy;

import java.util.Random;

/**
 * @Author: waynechin
 * @Date: 2019/3/29 10:15
 */
public class Proxy implements Sourceable{

    private Sourceable source;

    public Proxy(){
        super();
        source = new Source();
    }

    public Proxy(Sourceable source) {
        this.source = source;
    }

    public void method() {
        before();
        if(new Random().nextBoolean()){
            source.method();
        }else{
            System.out.println("proxy is busy!");
        }

        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
