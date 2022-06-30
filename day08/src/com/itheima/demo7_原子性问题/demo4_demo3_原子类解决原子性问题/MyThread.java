package com.itheima.demo7_原子性问题.demo4_demo3_原子类解决原子性问题;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread{
    // 共享变量
    //static int a = 0;
    static AtomicInteger a = new AtomicInteger(0);


    @Override
    public void run() {
        // 线程任务代码
        for (int i = 0; i < 10000; i++) {
            //a++;
            a.getAndIncrement();
        }
        System.out.println("循环执行完了,子线程执行完毕!");
    }
}
