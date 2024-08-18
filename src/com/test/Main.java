package com.test;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.229.129:3306/web_study", "root", "123456");
             Statement statement = connection.createStatement()) {
            List<String> user = List.of("小刚","小强","小王","小美","小黑子");
            for(String name : user){
                statement.addBatch("insert into user (name,age) values('"+name+"',19)");
            }
            int[] result = statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
