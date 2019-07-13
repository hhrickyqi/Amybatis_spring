package com.weichuang.test;

import com.weichuang.dao.UserMapper;
import com.weichuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBatisSpring {
    @Test
    public void testFn(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);;
    }
}
