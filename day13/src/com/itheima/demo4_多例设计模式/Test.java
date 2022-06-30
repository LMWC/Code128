package com.itheima.demo4_多例设计模式;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Person.P1);
            System.out.println(Person.P2);
            System.out.println(Person.P3);
        }
    }
}
