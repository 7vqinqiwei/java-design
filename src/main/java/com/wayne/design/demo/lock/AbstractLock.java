package com.wayne.design.demo.lock;

/**
 * @author
 */
public abstract class AbstractLock implements Lock{

    /**
     * 尝试获得锁资源 -- 这里的逻辑会引起死锁 就是一直获取不到锁的情况 - 导致调用者一直等待
     * @param name
     */
    @Override
    public void getLock(String name) {
        if (tryLock(name)) {
            System.out.println("##获取lock锁的资源####");
        } else {
            // 等待
            waitLock(name);
            // 重新获取锁资源
            getLock(name);
        }

    }

    /**
     * 获取锁资源
     * @param name
     * @return
     */
    public abstract boolean tryLock(String name);

    /**
     * 等待
     * @param name
     */
    public abstract void waitLock(String name);

}
