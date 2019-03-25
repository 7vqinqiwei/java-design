package com.wayne.design.pattern.singleton;

/**
 * @Author: waynechin
 * @Date: 2019/3/25 11:08
 *
 */
public class VolatileSingleton {

    private static volatile VolatileSingleton instance;

    private VolatileSingleton(){}

    /**
     * 双重检查锁
     * 注意：volatile 在 1.5 + 才能正确工作  -- 指令重排优化
     * @return
     */
    public VolatileSingleton getInstance(){
        if(null == instance){
            synchronized (VolatileSingleton.class){
                if(null == instance){
                    instance = new VolatileSingleton();
                }
            }
        }
        return instance;
    }

}
