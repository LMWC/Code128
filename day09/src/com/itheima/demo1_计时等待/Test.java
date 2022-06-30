package com.itheima.demo1_计时等待;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 9:34
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            System.out.println("i的值:"+i);
            // 打印一次暂停3秒
            Thread.sleep(3000);
        }
    }
}
