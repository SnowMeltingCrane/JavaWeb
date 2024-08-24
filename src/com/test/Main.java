package com.test;

import com.test.entity.Group;
import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session = MybatisUtils.openSession(true)) {
            TestMapper mapper = session.getMapper(TestMapper.class);
            List<String> users = new ArrayList<>(Arrays.asList("小明","小刚","小红"));
            mapper.insertUsers(users);
            session.commit();
        }
    }
}
