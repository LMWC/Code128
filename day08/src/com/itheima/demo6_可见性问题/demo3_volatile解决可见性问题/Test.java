package com.itheima.demo6_可见性问题.demo3_volatile解决可见性问题;

public class Test {
    public static void main(String[] args) {
        /*
            概述:volatile关键字，标记存在可见性问题变量，确保被修改后的数据被及时读取。
            格式: 权限修饰符 volatile 数据类型  变量名;
            原理
                读内存:当读一个 volatile 变量时，JMM 会把该线程对应的本地内存置为无效。线程之后将从主内存中读取共享变量。
                写内存:当写一个 volatile 变量时，JMM 会把该线程对应的本地内存中的共享变量值刷新到主内存
         */
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

    }
}
