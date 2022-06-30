package com.itheima.demo3_同步方法;

public class Test {
    public static void main(String[] args) {
        /*
            同步方法:
                概述:synchronized修饰的方法,叫做同步方法，表示只对这个方法中的资源实行互斥访问。
                格式:
                    修饰符 synchronized 返回值类型 方法名(形参){}
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
