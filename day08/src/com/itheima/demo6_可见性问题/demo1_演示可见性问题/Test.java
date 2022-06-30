package com.itheima.demo6_可见性问题.demo1_演示可见性问题;

public class Test {
    public static void main(String[] args) {
        // 创建并启动子线程
        MyThread mt = new MyThread();
        mt.start();

        // 主线程
        while (true){
            if (MyThread.flag == true){
                System.out.println("主线程结束死循环!");
                break;
            }
        }
        /*
            期望的结果: 子线程把共享变量的值修改为true之后,主线程的死循环可以结束
            实际的结果: 子线程把共享变量的值修改为true之后,主线程的死循环没有结束或者结束了
            问题: 子线程对共享变量值的修改,对主线程不可见
         */
    }
}
