package com.test;

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
            System.out.println("已经连接到服务端");
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            String str ;
            while(true){
                str = in.nextLine();
                if(str.equals("exit")){
                    break;
                }
                outputStream.write(str.getBytes());
                int len;
                byte[] bytes = new byte[1024];
                len = inputStream.read(bytes);
                System.out.println(new String(bytes,0,len));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
