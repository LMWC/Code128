package com.itheima.demo18_通过实现的方式创建并启动多条线程;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 获取当前线程对象.getName();
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ":子线程开始执行任务代码...");
        // 暂停3秒--public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停执行
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + ":子线程结束执行任务代码...");
    }
}
