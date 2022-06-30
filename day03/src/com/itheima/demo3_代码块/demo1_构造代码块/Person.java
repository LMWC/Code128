package com.itheima.demo3_代码块.demo1_构造代码块;

public class Person {
    // 构造代码块
    {
        System.out.println("Person 构造代码块...");
    }

    public Person() {
        System.out.println("Person 构造方法...");
    }
}
