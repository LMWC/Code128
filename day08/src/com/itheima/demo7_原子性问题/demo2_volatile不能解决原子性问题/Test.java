package com.itheima.demo7_原子性问题.demo2_volatile不能解决原子性问题;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 需求:通过主线程和子线程对一个共享变量各递增10000次
        // 创建并启动子线程
        MyThread mt = new MyThread();
        mt.start();

        // 主线程
        for (int i = 0; i < 10000; i++) {
            MyThread.a++;
        }

        // 暂停一下,保证所有线程都执行完毕在打印共享变量a的值
        Thread.sleep(2000);

        // 打印最终共享变量a的值
        System.out.println("最终共享变量a的值: " + MyThread.a);

    }
}
