package com.itheima.demo5_Lock锁;

import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
    // 共享变量
    int tickets = 100;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        // 线程任务代码---卖票
        // 循环卖票
        while (true){// 一次循环就是卖一张票
            // 加锁
            lock.lock();
            // 出口
            if (tickets < 1){
                // 释放锁
                lock.unlock();
                break;
            }
            // 收钱
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 出票
            System.out.println(Thread.currentThread().getName()+":正在出售第"+tickets+"张票");
            // 票号应该减1
            tickets--;
            // 释放锁
            lock.unlock();
        }
    }
}
