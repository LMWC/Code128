package com.itheima.demo10_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread extends Thread{
    CyclicBarrier cb;

    public MyThread(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println(getName()+":到达会议室...");
        // 调用await()方法,告诉CyclicBarrier,到达屏障,进入阻塞
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println(getName()+":离开会议室...");
    }
}
