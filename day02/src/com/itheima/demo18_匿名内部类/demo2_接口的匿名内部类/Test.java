package com.itheima.demo18_匿名内部类.demo2_接口的匿名内部类;

interface A{
    void method();
}

public class Test {
    public static void main(String[] args) {
        /*
            接口的匿名内部类:
                概述: 本质其实就是一个接口的 实现类对象
                格式:
                    new 接口名(){
                      重写接口中所有的抽象方法
                    };
                作用: 简化代码的
                使用场景: 如果想得到一个接口的实现类对象,就可以直接创建该接口的匿名内部类

            需求: 调用A接口中的method方法
            分析: 接口是无法创建对象的,所以需要创建A接口的实现类对象来调用
            以前的方式:
                1.创建一个实现类实现A接口
                2.在实现类中重写A接口中的方法
                3.创建实现类对象
                4.调用method方法
            匿名内部类: 直接创建A接口的匿名内部类,调用method方法即可
         */
        new A(){
            @Override
            public void method() {
                System.out.println("重写method方法...");
            }
        }.method();

        System.out.println("_---------");

        // 多态
        // 左边是A接口类型的变量,右边是A接口的实现类对象(匿名内部类)
        A a = new A() {
            @Override
            public void method() {
                System.out.println("重写method方法2...");
            }
        };
        a.method();
        a.method();
    }
}

