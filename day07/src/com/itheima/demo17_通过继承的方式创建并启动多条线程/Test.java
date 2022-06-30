package com.itheima.demo17_通过继承的方式创建并启动多条线程;

public class Test {
    public static void main(String[] args) {

        // 创建并启动多条线程
        MyThread mt1 = new MyThread("A");
        MyThread mt2 = new MyThread("B");
        MyThread mt3 = new MyThread("C");
        MyThread mt4 = new MyThread("D");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

    }
}
