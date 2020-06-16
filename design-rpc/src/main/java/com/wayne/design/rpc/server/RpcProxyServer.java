package com.wayne.design.rpc.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RpcProxyServer {

    private final ExecutorService executorService = Executors.newCachedThreadPool();

    public  void publisher (final Object service, int port){
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);

            while (true){
                final Socket socket = serverSocket.accept();
                executorService.execute(new ProcessorHandler(socket,service));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != serverSocket){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
