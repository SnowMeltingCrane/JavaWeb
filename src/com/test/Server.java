package com.test;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)){
            Socket socket =server.accept();
            InputStream in = socket.getInputStream();
            while(!socket.isClosed()){
                int i = in.read();
                if(i == -1) break;
                System.out.print((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
