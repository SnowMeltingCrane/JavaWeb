package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket();
            Scanner scanner = new Scanner(System.in)) {
            while(true){
                String str = scanner.nextLine();
                byte[] data = str.getBytes();
                InetAddress address = InetAddress.getByName("localhost");
                DatagramPacket packet = new DatagramPacket(data, data.length,address,8080);
                socket.send(packet);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
