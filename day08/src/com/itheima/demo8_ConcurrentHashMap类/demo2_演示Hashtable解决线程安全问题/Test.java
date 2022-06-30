package com.itheima.demo8_ConcurrentHashMap类.demo2_演示Hashtable解决线程安全问题;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // 需求：使用两个线程，向同一个HashMap集合，各添加数据50000次，预期结果50000对数据
        // 创建并启动线程
        MyThread mt = new MyThread();
        mt.start();

        // 主线程往HashMap集合中添加5万个键值对
        for (int i = 0; i < 50000; i++) {
            MyThread.map.put(i,i);
        }

        // 暂停2s,保证主线程和子线程都执行完毕才会打印最终map集合键值对的个数
        Thread.sleep(2000);

        // 打印最终map集合键值对的个数
        System.out.println("最终map集合键值对的个数: "+ MyThread.map.size());


    }
}
