package com.wayne.design.pattern.singleton;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 10:20
 */
public class HungerSingleton {

    /**
     * 这种方式比较常用，但容易产生垃圾对象
     * 优点：没有加锁，执行效率会提高。
     * 缺点：类加载时就初始化，浪费内存。
     * 当然classLoader 被其它方式装载就不展开了，同时也没有Lazyloading的效果 -- 查看InnerHolderSingleton
     *
     */
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){}

    private static HungerSingleton getInstance(){
        return instance;
    }

}
