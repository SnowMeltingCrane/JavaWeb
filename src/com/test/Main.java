package com.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.229.129:3306/web_study", "root", "123456");
             PreparedStatement statement = connection.prepareStatement("select * from account where name = ? and password = ?");
             Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入用户名：");
            String username = scanner.nextLine();
            System.out.print("请输入密码：");
            String password = scanner.nextLine();

            statement.setString(1,username);
            statement.setString(2,password);

            ResultSet rs = statement.executeQuery();

            if(rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3));
                System.out.println("登录成功 账户信息为："+account);
            }else {
                System.out.println("登录失败，用户名或密码错误");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
