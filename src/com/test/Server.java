package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080);
            FileOutputStream outputStream = new FileOutputStream("xxx.txt")){
            Socket socket = server.accept();
            System.out.println("接收来自客户端的连接"+socket.getInetAddress()+":"+socket.getPort());
            InputStream inputStream = socket.getInputStream();
            long len,total=0;
            byte[] buffer=new byte[1024];
            while((len=inputStream.read(buffer))!=-1){
                total+=len;
                System.out.println("文件正在读取，已读取"+total+"字节");
                outputStream.write(buffer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
