package com.itheima.demo3_等待唤醒机制;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 10:09
 */
public class Test {
    // 锁对象
    public static Object lock = new Object();
    // 开关变量---旗帜变量
    public static boolean flag = false;// true: 子线程执行  false: 主线程执行

    public static void main(String[] args) {
        // 需求: 主线程和子线程有规律的交替打印输出
        // 创建并启动子线程
        new MyThread().start();

        // 主线程的任务
        for (int j = 0; j < 100; j++) {
            synchronized (lock) {
                if (flag == true) {
                    // 无限等待
                    try {
                        Test.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (flag == false) {
                    System.out.println("主线程j的值是:" + j);
                    lock.notify();
                    flag = true;
                }
            }
        }

        // 结果:
        // i-j-i-j-i-j-i....
        // j-i-j-i-j-i-j....
    }
}
