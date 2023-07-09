package com.atguigu.spring6.resource.service;

import com.atguigu.spring6.resource.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "myUserRedisDaoImpl")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao redis");
    }
}
