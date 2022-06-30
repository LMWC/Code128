package com.itheima.demo14_死锁;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("A锁"){// 获取A锁
                    System.out.println("线程1: 获取到了A锁,准备获取B锁...");
                    synchronized ("B锁"){// 获取B锁
                        System.out.println("线程1: 获取到了A锁,B锁,执行任务代码..");
                    }// 释放B锁
                }// 释放A锁
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("B锁"){// 获取B锁
                    System.out.println("线程2: 获取到了B锁,准备获取A锁...");
                    synchronized ("A锁"){// 获取A锁
                        System.out.println("线程2: 获取到了B锁,A锁,执行任务代码..");
                    }// 释放A锁
                }// 释放B锁
            }
        }).start();
    }
}
