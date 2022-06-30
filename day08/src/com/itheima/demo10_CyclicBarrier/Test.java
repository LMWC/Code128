package com.itheima.demo10_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个CyclicBarrier对象,指定线程组的数量,和任务
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("会议内容: 今晚加班!");
            }
        });
        // 创建并启动五条线程
        MyThread mt1 = new MyThread(cb);
        MyThread mt2 = new MyThread(cb);
        MyThread mt3 = new MyThread(cb);
        MyThread mt4 = new MyThread(cb);
        MyThread mt5 = new MyThread(cb);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();

        // 间隔几秒之后再启动第5条线程
        Thread.sleep(10000);
        mt5.start();
    }
}
