package com.itheima.demo7_原子性问题.demo3_线程同步解决原子性问题;

public class MyThread extends Thread{
    // 共享变量
    static int a = 0;

    @Override
    public void run() {
        // 线程任务代码
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                a++;
            }
        }
        System.out.println("循环执行完了,子线程执行完毕!");
    }
}
