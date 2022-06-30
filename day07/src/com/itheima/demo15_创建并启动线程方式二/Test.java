package com.itheima.demo15_创建并启动线程方式二;

public class Test {
    public static void main(String[] args) {
        /*
            创建并启动线程方式二:
                1.创建Runnable的实现类
                2.在实现类中重写run方法,在run方法中书写线程需要执行的任务代码
                3.创建Thread线程对象,并传入Runnable的实现类对象
                4.调用start方法启动线程,执行任务
         */
        // 1.创建Runnable实现类对象
        MyRunnable mr = new MyRunnable();

        // 2.创建Thread线程对象,传入Runnable实现类对象
        Thread t = new Thread(mr);

        // 3.调用start方法启动线程,执行任务
        t.start();

        for (int j = 0; j < 100; j++) {
            System.out.println("HelloWorld--j:" + j);
        }
    }
}
