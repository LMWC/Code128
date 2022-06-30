package com.itheima.demo13_线程池的使用.demo3_线程池的练习;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
