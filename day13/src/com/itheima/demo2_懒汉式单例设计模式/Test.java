package com.itheima.demo2_懒汉式单例设计模式;

public class Test {
    public static void main(String[] args) {
        //Person.method();
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
        System.out.println(Person.getInstance());
    }
}
/*执行结果:
        com.itheima.demo2_懒汉式单例设计模式.Person@16d3586
        com.itheima.demo2_懒汉式单例设计模式.Person@16d3586
        com.itheima.demo2_懒汉式单例设计模式.Person@16d3586
        com.itheima.demo2_懒汉式单例设计模式.Person@16d3586*/

