package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testSM {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        UserDao userDao = (UserDao) ca.getBean("userDao");
        userDao.insert(new User(null,"恰恰时","123456"));
        System.out.println("插入成功");
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        UserDao userDao = (UserDao) ca.getBean("userDao");
        List<User> users = userDao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
    @Test
    public void test3(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        UserDao userDao = (UserDao) ca.getBean("userDao");

        userDao.update(new User(2,"皇皇","1666"));

    }
    @Test
    public void test4(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        /*UserDao userDao = (UserDao) ca.getBean("userDao");

        userDao.delete(3);*/
        UserService userService = (UserService)ca.getBean("userService");
        userService.delete(7);
    }
    @Test
    public void test5(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        UserDao userDao = (UserDao) ca.getBean("userDao");
        Integer[] ids = {1,2};
        userDao.deleteByIds(ids);

    }
    @Test
    public void test6(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取到接口的实现类对象（默认接口名称首字母小写）
        UserService userService = (UserService)ca.getBean("userService");
        userService.insert(new User(null,"嘿嘿","12345"));
    }



}
