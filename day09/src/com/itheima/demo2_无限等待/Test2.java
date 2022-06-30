package com.itheima.demo2_无限等待;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 9:38
 */
public class Test2 {
    // 锁对象
    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        // 创建并启动线程--->进入无限等待
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("无限等待线程: 准备进入无限等待...");
                synchronized (obj) {// 加锁
                    try {
                        obj.wait();// 进入无限等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("无限等待线程:被其他线程唤醒,并获取到锁对象,继续执行...");
                }// 释放锁
            }
        }).start();

        // 为了让无限等待线程先执行,开启唤醒线程之前睡眠一下
        Thread.sleep(100);

        // 创建并启动线程--->唤醒等待线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("唤醒线程:准备唤醒无限等待线程");
                synchronized (obj){
                    obj.notify();
                }
            }
        }).start();

        /*
            分析程序:
                1.程序进入无限等待状态会释放锁,释放cpu,并且不会再去抢占
                2.无限等待线程被唤醒,拿到锁对象之后,会从进入无限等待的位置继续往下执行
         */
    }
}
