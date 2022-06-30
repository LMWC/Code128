package com.itheima.demo2_权限修饰符;

import com.itheima.demo1_权限修饰符.Person;

public class Student extends Person {
    // 不同包的子类
    public void show(){
        method1();
        method2();
        //method3();// 编译报错
        //method4();// 编译报错
    }
}
