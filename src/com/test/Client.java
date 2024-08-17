package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1",8080);
            Scanner in = new Scanner(System.in)){
            System.out.println("已经连接到服务端,请输入要传输的文件地址");
            OutputStream outputStream = socket.getOutputStream();
            String path = in.nextLine();
            FileInputStream inputStream = new FileInputStream(path);
            inputStream.transferTo(outputStream);
            inputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
