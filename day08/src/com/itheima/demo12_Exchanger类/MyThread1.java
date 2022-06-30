package com.itheima.demo12_Exchanger类;

import java.util.concurrent.Exchanger;

public class MyThread1 extends Thread{
    Exchanger<String> ex;

    public MyThread1(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        // "数据1"
        System.out.println("线程1: 准备传递数据给线程2");
        String msg = null;
        try {
            msg = ex.exchange("数据1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1: 线程2传递回来的数据 " + msg);
    }
}
