package com.itheima.demo7_原子性问题.demo2_volatile不能解决原子性问题;

public class MyThread extends Thread{
    // 共享变量
    static volatile int a = 0;

    @Override
    public void run() {
        // 线程任务代码
        for (int i = 0; i < 10000; i++) {
            a++;
        }
        System.out.println("循环执行完了,子线程执行完毕!");
    }
}
