package com.itheima.demo6_可见性问题.demo2_锁解决可见性问题;

public class Test {
    public static void main(String[] args) {
        // 创建并启动子线程
        MyThread mt = new MyThread();
        mt.start();

        // 主线程
        while (true){
            synchronized (mt) {
                if (MyThread.flag == true){
                    System.out.println("主线程结束死循环!");
                    break;
                }
            }
        }
        /*
            原理
                当线程释放锁时，JMM会把该线程对应的工作内存中的共享变量刷新到主内存中，以确保之后的线程可以获取到最新的值。
                当线程获取锁时，JMM会把该线程对应的工作内存存置为无效。从而使得被监视器保护的临界区代码必须要从主内存中去读取共享变量。

         */
    }
}
