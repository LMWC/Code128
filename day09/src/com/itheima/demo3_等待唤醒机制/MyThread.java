package com.itheima.demo3_等待唤醒机制;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 10:10
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (Test.lock) {
                if (Test.flag == false) {
                    // 无限等待
                    try {
                        Test.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (Test.flag == true) {
                    System.out.println("子线程i的值是:" + i);
                    Test.lock.notify();
                    Test.flag = false;
                }
            }
        }
    }
}
