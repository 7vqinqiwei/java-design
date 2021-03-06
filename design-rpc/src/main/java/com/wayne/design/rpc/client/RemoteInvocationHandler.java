package com.wayne.design.rpc.client;



import com.wayne.design.rpc.common.RpcRequst;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RemoteInvocationHandler implements InvocationHandler {


    private String host;
    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequst requst = new RpcRequst();
        requst.setMethodName(method.getName());
        requst.setParameters(args);

        RpcNetTransport rpcNetTransport = new RpcNetTransport(host,port);

        return  rpcNetTransport.send(requst);
    }
}
