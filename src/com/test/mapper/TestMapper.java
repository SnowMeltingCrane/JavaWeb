package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    User selectByIdAndAge(@Param("id")int id,@Param("age") int age);
}
