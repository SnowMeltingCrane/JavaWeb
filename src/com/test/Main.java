package com.test;

import com.test.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try(SqlSession session = MybatisUtils.openSession(true)){
            Map<String,User> map = session.selectMap("selectUsersByAge",20,"id");
            System.out.println(map);
        }
    }
}
