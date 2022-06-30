package com.itheima.demo2_同步代码块;

public class MyRunnable implements Runnable {
    // 共享变量
    int tickets = 100;

    @Override
    public void run() {
        // 线程任务代码---卖票
        // 循环卖票
        while (true){// 一次循环就是卖一张票
            synchronized (this){
                // 出口
                if (tickets < 1){
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
            }
        }
    }
}
