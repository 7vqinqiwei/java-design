package com.wayne.design.rpc.client;

import com.wayne.design.rpc.common.RpcRequst;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RpcNetTransport {

    private String host;
    private int port;

    public RpcNetTransport(String host, int port) {
        this.host = host;
        this.port = port;
    }

    private Socket newSocket(){
        System.out.println("创建一个新的连接");
        Socket socket = null;
        try {
            socket = new Socket(host,port);

        } catch (IOException e) {
            System.out.println("创建连接失败");
        }
        return  socket;
    }


    public Object send(RpcRequst requst){
        Socket socket = null;
        try {
            socket = newSocket();
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(requst);
            outputStream.flush();

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Object result = inputStream.readObject();

            outputStream.close();
            inputStream.close();
            return  result;
        }catch (Exception e){
            throw new RuntimeException("数据发送异常："+requst);
        }finally {
            if(null != socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
