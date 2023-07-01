package com.atguigu.spring6.iocxml.life;

public class User {
    public User() {
        System.out.println("call default constructor");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setting field");
        this.name = name;
    }

    public void init(){
        System.out.println("initialize");
    }

    public void destory(){
        System.out.println("destroy");
    }
}
