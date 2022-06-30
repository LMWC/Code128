package com.itheima.demo13_线程池的使用.demo1_通过Runnable方式提交任务;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        // 1.创建线程池,初始化线程
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 2.创建任务,并提交任务,执行任务
        MyRunnable mr = new MyRunnable();
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);
        es.submit(mr);

        // 3.销毁线程池
        es.shutdown();// 一般不操作



    }
}
