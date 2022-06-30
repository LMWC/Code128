package com.itheima.demo14_创建并启动线程方式一;

// 线程类
public class MyThread extends Thread{

    @Override
    public void run() {
        // 线程任务代码
        for (int i = 0; i < 100; i++) {
            System.out.println("HelloWorld--i:" + i);
        }
    }
}
