package com.wayne.design.demo.lock.mysql;

import com.wayne.design.demo.lock.AbstractLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author
 * 数据库锁
 */
public class MysqlLock extends AbstractLock {

    private Logger logger = LoggerFactory.getLogger(MysqlLock.class);

    @Override
    public boolean tryLock(String name) {
        return false;
    }

    @Override
    public void waitLock(String name) {

    }

    @Override
    public void unLock(String name) {

    }
}
