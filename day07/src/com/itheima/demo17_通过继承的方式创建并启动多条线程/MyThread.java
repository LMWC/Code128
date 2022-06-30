package com.itheima.demo17_通过继承的方式创建并启动多条线程;

public class MyThread extends Thread {
    // 给子类构造方法调用的:
    //public Thread():分配一个新的线程对象,线程名字由系统默认给出
    //public Thread(String name):分配一个指定名字的新的线程对象

    public MyThread() {
        //super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 线程的任务代码
        // MyThread继承Thread类,那么就继承了Thread类中的方法
        System.out.println(getName() + ":子线程开始执行任务代码...");
        // 暂停3秒--public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停执行
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ":子线程结束执行任务代码...");

    }
}
