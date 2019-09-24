package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    //插入
    public void insert(User user);
    //查询所有
    public List<User> queryAll();
    //删除
    public void delete(Integer id);
    //修改
    public  void update(User user);

    //批量删除
    public void deleteByIds(Integer[] ids);
}
