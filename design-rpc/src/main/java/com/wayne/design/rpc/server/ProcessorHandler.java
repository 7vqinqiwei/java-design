package com.wayne.design.rpc.server;


import com.wayne.design.rpc.common.RpcRequst;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

public class ProcessorHandler implements Runnable {
    private Socket socket;
    private Object service;

    public ProcessorHandler(Socket serverSocket, Object service){
        this.service = service;
        this.socket = serverSocket;
    }

    @Override
    public void run() {
        System.out.println("开始执行服务器端处理方法");
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            //拿到输入流
            RpcRequst requst = (RpcRequst) objectInputStream.readObject();
            //request 里面应该含有那个类那个方法那些参数
            Object object = invoke(requst);

            objectOutputStream =new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != objectInputStream){
                    objectInputStream.close();
                }
                if(null != objectOutputStream){
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    /**
     * 通过反射调用服务端方法
     * @param requst
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws NoSuchMethodException
     */
    private Object invoke(RpcRequst requst) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object[] parameters = requst.getParameters();
        Class<?>[] type = new Class[parameters.length];
        for (int i=0;i<parameters.length;i++){
            type[i] = parameters[i].getClass();
        }
        Method method = service.getClass().getMethod(requst.getMethodName(),type);
        return method.invoke(service,parameters);
    }
}
