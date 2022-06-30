package com.itheima.demo8_ConcurrentHashMap类.demo1_演示HashMap线程安全问题;

import java.util.HashMap;

public class MyThread extends Thread{
    // 共享变量
    static HashMap<Integer,Integer> map = new HashMap<>();

    @Override
    public void run() {
        // 往HashMap集合中添加5万个键值对
        for (int i = 0; i < 50000; i++) {
            map.put(i,i);
        }
        System.out.println("子线程操作完毕!");
    }
}
