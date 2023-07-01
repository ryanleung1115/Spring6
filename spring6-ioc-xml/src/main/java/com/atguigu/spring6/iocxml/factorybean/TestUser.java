package com.atguigu.spring6.iocxml.factorybean;

import com.atguigu.spring6.iocxml.life.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
