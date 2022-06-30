package com.itheima.demo18_通过实现的方式创建并启动多条线程;

public class Test {
    public static void main(String[] args) {
        //public Thread(Runnable target):分配一个带有指定目标新的线程对象
        //public Thread(Runnable target,String name):分配一个带有指定目标新的线程对象并指定名字

        // 创建实现类对象
        MyRunnable mr = new MyRunnable();
        // 创建并启动多条线程
        Thread t1 = new Thread(mr,"A");
        Thread t2 = new Thread(mr,"B");
        Thread t3 = new Thread(mr,"C");
        Thread t4 = new Thread(mr,"D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
