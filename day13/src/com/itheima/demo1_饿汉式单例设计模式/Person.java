package com.itheima.demo1_饿汉式单例设计模式;

// 饿汉单例设计模式就是加载类的时候已经将该类的唯一对象创建完毕，不管以后会不会使用到该类对象，先创建了再说。
public class Person {
    // 1.将构造方法私有化,防止外界通过new调用构造方法创建对象
    private Person(){

    }

    // 2.在类中创建一个该类的唯一的对象（静态成员变量）
    private static final Person p = new Person();

    // 3.提供公共的静态方法来返回该类的唯一对象
    public static Person getInstance(){
        return p;
    }

    public static void method(){}
}

