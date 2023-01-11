package com.itheima.service.impl;

import com.itheima.Dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;
    public  UserServiceImpl(UserDao userDao ){
        this.userDao=userDao;

    }

    public UserServiceImpl() {

    }

/*
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao=userDao;
    }
*/

    public void save(){
        userDao.save();
    }


}
