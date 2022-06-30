package com.itheima.demo6_可见性问题.demo1_演示可见性问题;

public class MyThread extends Thread{

    // 共享变量
    static boolean flag = false;

    @Override
    public void run() {
        // 线程任务代码
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 修改共享变量的值
        flag = true;
        System.out.println("子线程执行完毕!");
    }
}
