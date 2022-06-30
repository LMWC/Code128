package com.itheima.demo2_无限等待;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 9:38
 */
public class Test1 {
    // 锁对象
    public static Object obj = new Object();

    public static void main(String[] args) {
        // 创建并启动线程--->进入无限等待
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("无限等待线程: 准备进入无限等待...");
                synchronized (obj) {
                    try {
                        obj.wait();// 进入无限等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("无限等待线程:被其他线程唤醒,并获取到锁对象,继续执行...");
                }
            }
        }).start();
    }
}
