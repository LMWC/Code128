package com.itheima.demo2_懒汉式单例设计模式;

// 概述：懒汉单例设计模式就是调用getInstance()方法时对象才被创建，先不急着创建出对象，等要用的时候才创建对象。
public class Person {
    // 1.将构造方法私有化,防止外界通过new调用构造方法创建该类的对象
    private Person() {

    }

    // 2.在类中定义一个本类的静态成员变量，初始值为null
    private static Person p = null;

    // 3.提供一个公共的，静态方法，用来返回该类的唯一对象
    public synchronized static Person getInstance(){
        // 3.1如果是第一次调用，就创建该类的唯一对象，并返回
        if (p == null) {
            p = new Person();
        }
        // 3.2如果不是第一次调用，就返回第一次调用时创建的对象
        return p;
    }

    public static void method(){}
}

