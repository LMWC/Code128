package com.itheima.demo3_代码块.demo3_优先级问题;

public class Person {
    // 构造代码块
    {
        System.out.println("Person 构造代码块...");
    }

    // 静态代码块
    static {
        System.out.println("Person 静态代码块...");
    }

    public Person() {
        System.out.println("Person 构造方法...");
    }
}
