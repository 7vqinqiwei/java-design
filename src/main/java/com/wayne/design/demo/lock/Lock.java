package com.wayne.design.demo.lock;

/**
 * @author
 */
public interface Lock {

    /**
     * 获取到锁的资源
     * @param name
     */
    void getLock(String name);

    /**
     * 释放锁
     * @param name
     */
    void unLock(String name);

}
