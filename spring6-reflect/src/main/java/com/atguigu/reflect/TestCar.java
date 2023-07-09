package com.atguigu.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class TestCar {
    @Test
    public void test1() throws Exception {
        Class carClass1 = Car.class;

        Class carClass2 = new Car().getClass();

        Class carClass3 = Class.forName("com.atguigu.reflect.Car");

        Car car = (Car) carClass3.getDeclaredConstructor().newInstance();
        System.out.println(car);
    }

    @Test
    public void test2() throws Exception {
        Class carClass1 = Car.class;

        // Constructor[] constructors = carClass1.getConstructors();
        Constructor[] constructors = carClass1.getDeclaredConstructors();
        for (Constructor c:constructors) {
            System.out.println(c.getName()+" "+c.getParameterCount());
        }
    }
}
