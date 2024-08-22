package com.test;

import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session = MybatisUtils.openSession(true)) {
            TestMapper mapper = session.getMapper(TestMapper.class);
            List<User> map = mapper.selectAllUser();
            map.forEach(System.out::println);
            System.out.println(map.get(1).getGroup());
        }
    }
}
