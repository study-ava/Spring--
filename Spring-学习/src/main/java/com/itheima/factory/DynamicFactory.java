package com.itheima.factory;

import com.itheima.Dao.UserDao;
import com.itheima.Dao.impl.UserDaoImpl;

public class DynamicFactory {

    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
