package com.itheima.demo16_创建并启动线程方式三;

public class Test {
    public static void main(String[] args) {
        /*
            实现方式:
                创建Thread类线程对象,并传入Runnable的匿名内部类
                在Runnable的匿名内部类中重写run方法,在run方法中书写线程需要执行的任务代码
                调用start方法启动线程,执行任务
         */
        // 1. 创建Thread类线程对象,并传入Runnable的匿名内部类
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                // 线程任务代码
                for (int i = 0; i < 100; i++) {
                    System.out.println("HelloWorld--i:" + i);
                }
            }
        });
        // 2.调用start方法启动线程,执行任务
        t.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("HelloWorld--j:" + j);
        }
    }
}
