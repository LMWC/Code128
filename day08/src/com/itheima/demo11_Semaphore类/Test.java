package com.itheima.demo11_Semaphore类;

import java.util.concurrent.Semaphore;

public class Test {
    public static void main(String[] args) {
        /*
            概述:Semaphore的主要作用是控制线程的并发数量,控制指定个线程可以同时访问一个方操作。
            构造方法:public Semaphore(int permits) 创建线程并发数量对象  permits 表示许可线程的数量
            常用方法:
                public void acquire() throws InterruptedException	表示获取许可
                public void release()	 表示释放许可
              需求：模拟多条线程进入浴室,但控制每次允许2个人进入浴室。
         */
        // 创建Semaphore对象和浴室对象
        Semaphore sp = new Semaphore(2);
        BathRoom br = new BathRoom(sp);

        // 创建并启动多条线程,这多条线程的任务就是调用service方法享受服务
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    br.service();
                }
            }).start();
        }
    }
}
