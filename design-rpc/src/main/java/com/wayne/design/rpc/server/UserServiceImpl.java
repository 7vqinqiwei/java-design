package com.wayne.design.rpc.server;


import com.wayne.design.rpc.common.IUserService;
import com.wayne.design.rpc.common.User;

public class UserServiceImpl implements IUserService {


    @Override
    public String save(User user) {
        System.out.println("request in" + user);
        return "save success";
    }

}
