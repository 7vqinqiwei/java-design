package com.wayne.design.demo.proxy.jdk;

import com.wayne.design.demo.proxy.User;

/**
 * jdk代理的对象需要一个接口 -- 实现与代理对需要实现该接口
 * @author
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

}
