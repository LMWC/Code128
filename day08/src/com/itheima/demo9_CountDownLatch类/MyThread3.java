package com.itheima.demo9_CountDownLatch类;

import java.util.concurrent.CountDownLatch;

public class MyThread3 extends Thread {
    CountDownLatch cdl;

    public MyThread3(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("D...");
        //调用countDown方法让计数器的值-1
        cdl.countDown();
    }
}
