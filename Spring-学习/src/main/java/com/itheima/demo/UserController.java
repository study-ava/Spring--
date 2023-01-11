package com.itheima.demo;

import com.itheima.Dao.UserDao;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
       // ApplicationContext app=new FileSystemXmlApplicationContext("E:\\Spring-学习\\src\\main\\resources\\applicationContext.xml");  /* 使用绝对路径 */

        /*getBean使用*/
        /* 1   类型相同但存在多个对象使用、Bean存在多个，使用id的方法  */
       // UserService userService=(UserService) app.getBean("userService");

        /* 2    都是唯一使用 、Bean只有一个，使用类型的方法*/
        UserService userService = app.getBean(UserService.class);


        userService.save();
    }

}
