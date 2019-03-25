package com.wayne.design.pattern.singleton;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 10:34
 */
public class InnerHolderSingleton {

    private InnerHolderSingleton(){}

    public static InnerHolderSingleton getInstance(){
        return Holder.INSTANCE;
    }

    /**
     * 这里的是内部静态类
     */
    private static class Holder{
        private static final InnerHolderSingleton INSTANCE = new InnerHolderSingleton();
    }

}
