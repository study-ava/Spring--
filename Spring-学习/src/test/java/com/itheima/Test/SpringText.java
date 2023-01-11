package com.itheima.Test;

import com.itheima.Dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {

    @Test
    public void test(){
        ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1=(UserDao) app.getBean("userDao");


        System.out.println(userDao1);
/*
        app.close();
*/
    }
}
