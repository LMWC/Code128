package com.itheima.demo13_线程池的使用.demo3_线程池的练习;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //需求:使用线程池方式执行任务,计算1-n的和
        //分析:因为需要返回求和结果,所以使用Callable方式的任务

        // 创建线程池,初始化线程
        ExecutorService es = Executors.newFixedThreadPool(2);

        // 创建任务
        MyCallable mc = new MyCallable(100);

        // 提交任务,执行任务
        Future<Integer> f = es.submit(mc);
        System.out.println(f.get());// 5050

        // 销毁线程池
        es.shutdown();

    }
}
