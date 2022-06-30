package com.itheima.demo12_Exchanger类;

import java.util.concurrent.Exchanger;

public class MyThread2 extends Thread{
   Exchanger<String> ex;

    public MyThread2(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        // "数据2"
        System.out.println("线程2: 准备传递数据给线程1");
        String msg = null;
        try {
            msg = ex.exchange("数据2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2: 线程1传递回来的数据 " + msg);
    }
}
