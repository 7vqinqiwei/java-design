package com.wayne.design.rpc.client;


import com.wayne.design.rpc.common.IUserService;
import com.wayne.design.rpc.common.User;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        //得到一个远程调用
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        //目标服务，IP，服务号
        IUserService userService = rpcProxyClient.clientProxy(IUserService.class,"localhost",8080);

        User user = new User();
        user.setName("qinqiwei");

        System.out.println(userService.save(user));
    }
}
