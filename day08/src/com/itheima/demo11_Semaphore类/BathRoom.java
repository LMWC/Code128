package com.itheima.demo11_Semaphore类;

import java.util.concurrent.Semaphore;

public class BathRoom {

    Semaphore sp;

    public BathRoom(Semaphore sp) {
        this.sp = sp;
    }

    public void service(){

        // 获得许可
        try {
            sp.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 享受服务
        System.out.println(Thread.currentThread().getName()+":获得许可...");
        System.out.println(Thread.currentThread().getName()+":开始享受服务...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":服务享受完毕,释放许可...");
        // 释放许可
        sp.release();
    }

}
