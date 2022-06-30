package com.itheima.demo4_同步方法的锁对象;

public class Test2 {
    public static void main(String[] args) {
        /*
            同步方法的锁对象:
                静态同步方法锁对象 :方法所在类的字节码对象(类名.class)
                非静态同步方法锁对象 :this
            案例: 一条线程使用同步代码块,一条线程使用同步方法,这2条线程要实现同步
            分析: 多条线程实现同步,锁对象要一致(相同)
         */
        Test2 test2 = new Test2();

        // 线程1模拟张三上厕所的过程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 调用wc1方法,实现张三上厕所的过程
                test2.wc1();

            }
        }).start();

        // 线程2模拟李四上厕所的过程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 加锁
                synchronized (test2) {
                    System.out.println("李四:打开厕所门...");
                    System.out.println("李四:关闭厕所门...");
                    System.out.println("李四:脱裤子,掏手机...");
                    System.out.println("李四:蹲下,用力...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("李四:擦屁股...");
                    System.out.println("李四:穿裤子,冲水...");
                    System.out.println("李四:打开厕所门...");
                    System.out.println("李四:洗手,走人...");
                }
                // 释放锁
            }
        }).start();
    }
    // 非静态同步方法: this
    public synchronized void wc1(){
        System.out.println("张三:打开厕所门...");
        System.out.println("张三:关闭厕所门...");
        System.out.println("张三:脱裤子,掏手机...");
        System.out.println("张三:蹲下,用力...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("张三:擦屁股...");
        System.out.println("张三:穿裤子,冲水...");
        System.out.println("张三:打开厕所门...");
        System.out.println("张三:洗手,走人...");
    }
}
