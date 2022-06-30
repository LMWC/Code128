package com.itheima.demo9_CountDownLatch类;

import java.util.concurrent.CountDownLatch;

public class MyThread1 extends Thread{
    CountDownLatch cdl ;

    public MyThread1(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        System.out.println("A...");
        // 调用await方法进行等待--等线程2打印B之后再执行
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C...");
    }
}
