package com.wayne.design.rpc.server;


import com.wayne.design.rpc.common.IUserService;

/**
 * Hello world!
 *
 */
public class Bootstrap
{
    public static void main( String[] args )
    {
        IUserService userService =  new UserServiceImpl();

        RpcProxyServer rpcProxyServer = new RpcProxyServer();
        rpcProxyServer.publisher(userService,8080);


    }
}
