package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void insert(User user) {

        userDao.insert(user);
        //throw new RuntimeException("呵呵");
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
