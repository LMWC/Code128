package com.itheima.demo10_抽象类的概述和定义;

// 抽象类
public abstract class Animal {
    // 成员变量
    String name;
    int age;

    // 构造方法
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 成员方法
    public void show(){
        System.out.println(name + "," + age);
    }

    // 抽象方法
}

