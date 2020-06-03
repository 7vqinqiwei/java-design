package com.wayne.design.demo.lock.mysql;

/**
 * @author
 */
public interface LockMapper {

    /**
     * 删除数据解锁
     * @param name
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String name, int id);

    /**
     * 新增数据加锁，id为同一个值
     * @param name
     * @param id
     * @return
     */
    int insert(String name, int id);

}
