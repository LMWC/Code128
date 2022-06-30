package com.itheima.demo5_Lambda表达式的体验;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:32
 */
public class Test {
    public static void main(String[] args) {
        // 实现Runnable接口的方式创建线程执行任务
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();

        //匿名内部类方式创建线程执行任务
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类的方式传递任务");
            }
        }).start();

        //以上2种方式,其实都是通过Runnable的实现类对象来传递任务给线程执行
        // 思考: 是否能不通过实现类对象传递任务给线程执行呢?--->函数式编程
        // 函数式编程: 强调是做什么,而不是以什么形式做

        //Lambda方式创建线程执行任务
        new Thread(()->{System.out.println("函数式编程思想方式传递任务");}).start();
    }
}
