package com.test;

import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session = MybatisUtils.openSession(true)) {
            TestMapper mapper = session.getMapper(TestMapper.class);
            User user = mapper.selectUserById(1);
            System.out.println(user);
        }
    }
}
