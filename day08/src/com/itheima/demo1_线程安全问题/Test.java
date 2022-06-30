package com.itheima.demo1_线程安全问题;

public class Test {
    public static void main(String[] args) {
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
        /*
            卖票案例问题:
                1.重复票
                2.遗漏票
                3.不存在票
           原因总结
                当某条线程在执行卖票的代码的时候,被其他线程干扰了,导致程序运行结果受影响
           解决思路
                当某条线程在执行卖票的代码的时候,不要被其他线程干扰
           解决办法:线程同步
                - **将多行代码当成是一个完整的整体，一个线程如果进入到这个代码块中，会全部执行完毕，执行结	束后，其它线程才会执行**。这样可以保证这多行的代码作为完整的整体，被一个线程完整的执行	完毕。
        同步机制的三中方式
                同步代码块
                同步方法
                Lock锁
         */
    }
}
