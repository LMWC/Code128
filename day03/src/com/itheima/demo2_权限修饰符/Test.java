package com.itheima.demo2_权限修饰符;

import com.itheima.demo1_权限修饰符.Person;

public class Test {
    public static void main(String[] args) {
        // 不同包的无关类
        Person p = new Person();
        p.method1();
        //p.method2();// 编译报错
        //p.method3();// 编译报错
        //p.method4();// 编译报错
    }
}
