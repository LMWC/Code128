package com.itheima.demo2_同步代码块;

public class Test {
    //static Object obj = new Object();
    public static void main(String[] args) {
        /*
            同步代码块:
                概述: 使用synchronized关键字修饰的代码块,这个就是同步代码块,可以实现互斥访问
                格式:
                    synchronized(锁对象){
                        代码块
                    }
               锁对象:
                    语法角度:锁对象可以是任意类的对象
                    同步角度:多条线程的锁对象必须一致(相同)
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
