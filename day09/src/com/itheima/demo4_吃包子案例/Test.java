package com.itheima.demo4_吃包子案例;

/**
 * @Author：pengzhilin
 * @Date: 2021/3/28 11:08
 */
public class Test {
    public static void main(String[] args) {
        // 创建包子对象
        BaoZi bz = new BaoZi();// xian: null,flag: false

        // 创建并启动包子铺线程
        new BaoZiPu(bz).start();

        // 创建并启动吃货线程
        new ChiHuo(bz).start();
    }
}
