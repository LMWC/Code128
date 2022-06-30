package com.itheima.demo14_创建并启动线程方式一;

public class Test {
    public static void main(String[] args) {
        /*
            创建并启动线程方式一: 通过继承的方式
                1.创建一个线程子类继承Thread类
                2.在线程子类中重写run方法,把线程需要执行的任务代码放在run方法中
                3.创建线程子类对象
                4.调用start方法启动线程,执行任务

            注意:
                1.main方法所在的线程叫做主线程
                2.自己创建的线程叫做子线程
                3.线程的调度是抢占式调度
         */
        // 创建线程子类对象
        MyThread mt = new MyThread();
        // 启动线程,执行任务
        mt.start();
        //mt.run();// 直接调用run方法,是没有启动线程的,只是执行了run方法,千万别调用
        //mt.start();// 线程不能重复启动,否则会报IllegalThreadStateException异常

        for (int j = 0; j < 100; j++) {
            System.out.println("HelloWorld--j:" + j);
        }

    }
}
