package com.wayne.design.demo.proxy.jdk;

import com.wayne.design.demo.proxy.User;

/**
 * @author
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user) {
        System.out.println("用户数据入库成功，数据为：" + user.toString());
    }
}
