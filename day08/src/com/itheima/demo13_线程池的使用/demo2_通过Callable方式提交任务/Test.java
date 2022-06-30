package com.itheima.demo13_线程池的使用.demo2_通过Callable方式提交任务;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.创建线程池,初始化线程
        ExecutorService es = Executors.newFixedThreadPool(3);

        // 2.创建任务,并提交任务,执行任务
        MyCallable mc = new MyCallable();
        //es.submit(mc);
        //es.submit(mc);
        //es.submit(mc);
        //es.submit(mc);
        Future<String> f = es.submit(mc);
        System.out.println("f.get() = " + f.get());// java

        // 3.销毁线程池
        es.shutdown();// 一般不操作

    }
}
