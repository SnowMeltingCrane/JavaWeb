package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
       try(DatagramSocket socket = new DatagramSocket(8080)){
           while(true){
               DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
               socket.receive(packet);
               System.out.println("接收到来自ip"+packet.getAddress()+packet.getPort()+"的数据包："+new String(packet.getData(),packet.getOffset(),packet.getLength()));
           }
       }catch(IOException e){

       }
    }
}
