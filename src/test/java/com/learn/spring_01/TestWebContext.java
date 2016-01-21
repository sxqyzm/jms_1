package com.learn.spring_01;
import com.learn.spring_01.Model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import  com.learn.spring_01.Dao.userDAO;

/**
 * Created by zhangmeng on 2016/1/7.
 */
public class TestWebContext {
    ApplicationContext context;

    @Before
    public  void loadSpringContext(){
        context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }
    @Test
    public  void test(){
        userDAO userDAO=(userDAO)context.getBean("userDao");
        User user=new User();
        user.setId(1);
        user.setUsername("Jessica");
        user.setPassword("123");
        userDAO.addUser(user);

    }

}
