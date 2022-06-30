package com.itheima.demo1_饿汉式单例设计模式;

public class Test {
    public static void main(String[] args) {
        // Person.method();// 已经创建了该类的唯一对象

        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
    }
}

/*结果: 地址值相同
        com.itheima.demo1_饿汉式单例设计模式.Person@16d3586
        com.itheima.demo1_饿汉式单例设计模式.Person@16d3586
        com.itheima.demo1_饿汉式单例设计模式.Person@16d3586
        com.itheima.demo1_饿汉式单例设计模式.Person@16d3586*/
