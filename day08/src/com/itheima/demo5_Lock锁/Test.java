package com.itheima.demo5_Lock锁;

public class Test {
    public static void main(String[] args) {
        /*
            Lock锁:
                构造方法:public ReentrantLock(){}
                常用方法：
                    public void lock() 加同步锁。
                    public void unlock() 释放同步锁。
         */
        // 创建并启动4条线程---模拟4个窗口卖票--共同卖100张票
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");
        Thread t3 = new Thread(mr, "窗口3");
        Thread t4 = new Thread(mr, "窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
