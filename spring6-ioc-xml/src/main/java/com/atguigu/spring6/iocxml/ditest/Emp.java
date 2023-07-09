package com.atguigu.spring6.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    private String ename;
    private int age;
    private Dept dept;
    private  String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void work() {
        System.out.println("emp " + ename + " (" + age + ") " + "is working");
        dept.info();
        System.out.println(Arrays.toString(hobbies));
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
