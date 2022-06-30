package com.itheima.demo13_线程池的使用.demo2_通过Callable方式提交任务;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        // 任务代码
        System.out.println(Thread.currentThread().getName()+": 开始执行任务...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+": 结束执行任务...");

        return "java";
    }
}
