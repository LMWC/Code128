package com.itheima.demo3_多例设计模式;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Person.getInstance());
        }
    }
}
/*执行结果:
        com.itheima.demo3_多例设计模式.Person@154617c
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@154617c
        com.itheima.demo3_多例设计模式.Person@154617c
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@a14482
        com.itheima.demo3_多例设计模式.Person@154617c*/
