package com.itheima.demo3_代码块.demo2_静态代码块;

public class Person {
    // 静态代码块
    static {
        System.out.println("Person 静态代码块...");
    }

    public Person() {
        System.out.println("Person 构造方法...");
    }
}
