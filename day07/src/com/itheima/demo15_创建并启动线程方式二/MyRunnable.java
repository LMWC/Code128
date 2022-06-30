package com.itheima.demo15_创建并启动线程方式二;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 线程任务代码
        for (int i = 0; i < 100; i++) {
            System.out.println("HelloWorld--i:" + i);
        }
    }
}
