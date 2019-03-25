package com.wayne.design.pattern.singleton;

/**
 * 懒汉单例
 * @author waynechin
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton (){}

    /**
     * 是否 Lazy 初始化：是
     *
     * 严格意义上多线程下需要加锁否则并不是单例 -- 单线程
     * @return
     */
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 是否 Lazy 初始化：是
     *
     * 是否多线程安全：是
     * @return
     */
    public synchronized static LazySingleton getInstanceWithSyn(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    //BolatileSingleton也是Lazy loading的变种方式

}
