package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){
            Socket socket = server.accept();
            System.out.println("接收来自客户端的连接"+socket.getInetAddress()+":"+socket.getPort());
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            int len = 0;
            byte[] buffer = new byte[1024];
            while((len=inputStream.read(buffer))!=-1){
                System.out.println("接收来自客户端的数据："+new String(buffer,0,len));
                outputStream.write(("已收到长度为"+len+"字节的数据").getBytes());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
