package com.test.test;


import com.test.MybatisUtils;
import com.test.entity.Group;
import com.test.entity.User;
import com.test.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void method1(){
        try(SqlSession session = MybatisUtils.openSession(true)){
            TestMapper mapper = session.getMapper(TestMapper.class);
            User user = mapper.selectUserById(1);
            Group group = new Group().setId(1).setName("汪汪队");
            Assert.assertEquals(new User().setId(1).setName("小明").setAge(19).setGroup(group),user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    public void method2(){
        System.out.println("我是测试用例2");
    }

}
