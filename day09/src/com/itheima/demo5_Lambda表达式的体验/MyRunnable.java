package com.itheima.demo5_Lambda表达式的体验;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:33
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现类的方式传递任务");
    }
}
