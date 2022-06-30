package com.itheima.demo9_CountDownLatch类;

import java.util.concurrent.CountDownLatch;

public class Test {
    public static void main(String[] args) {
        // 创建 CountDownLatch对象,指定计数器的值为1
        CountDownLatch cdl = new CountDownLatch(2);

        // 创建并启动2条线程
        new MyThread1(cdl).start();
        new MyThread2(cdl).start();
        new MyThread3(cdl).start();
    }
}
