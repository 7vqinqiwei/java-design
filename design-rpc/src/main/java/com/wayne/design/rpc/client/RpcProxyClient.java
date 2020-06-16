package com.wayne.design.rpc.client;

import java.lang.reflect.Proxy;

public class RpcProxyClient {

    //代理对象

    public <T> T clientProxy(Class<T> interfaceCls, final String host, final int port){
        return (T) Proxy.newProxyInstance(interfaceCls.getClassLoader(),
                new Class<?>[]{interfaceCls},new RemoteInvocationHandler(host, port));
    }

}
