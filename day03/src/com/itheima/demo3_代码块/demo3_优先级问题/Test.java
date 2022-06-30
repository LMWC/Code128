package com.itheima.demo3_代码块.demo3_优先级问题;

public class Test {
    public static void main(String[] args) {
        /*
            优先级:  静态代码块 > 构造代码块  > 构造方法
         */
        new Person();
    }
}
