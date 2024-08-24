package com.test.mapper;

import com.test.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    User selectByIdAndAge(@Param("id")int id,@Param("age") int age);
    int insertUser(@Param("name") String name,@Param("age") int age);
    int insertUser(User user);
    int updateAgeById(@Param("id") int id,@Param("age") int age);
    int updateAgeById(User user);
    int deleteUserById(int id);
    int insertUsers(List<String> users);
}
