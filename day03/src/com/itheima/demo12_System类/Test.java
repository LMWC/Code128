package com.itheima.demo12_System类;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
            概述:java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作。
            构造方法:System类构造方法被私有修饰，不能创建对象。通过类名调用内部静态方法即可。
            常用方法:
                public static void exit(int status)    终止当前运行的Java虚拟机，非零表示异常终止
                public static long currentTimeMillis() 返回当前时间(以毫秒为单位)
         */
        /*System.out.println("开始...");
        // 提前结束程序
        // 方式一: return结束方法
        //return;
        // 方式二: System类的exit方法
        System.exit(0);
        System.out.println("执行...");
        System.out.println("结束...");*/

        // 获取当前时间距离标准基准时间的毫秒值
        /*long time = System.currentTimeMillis();
        System.out.println("time = " + time);

        long time1 = new Date().getTime();
        System.out.println("time1 = " + time1);*/

        // 可以用于测试一段代码的执行效率
        // 循环之前获取当前时间距离标准基准时间的毫秒值
        long time1 = System.currentTimeMillis();
        // 循环
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World");
        }
        // 循环之后获取当前时间距离标准基准时间的毫秒值
        long time2 = System.currentTimeMillis();
        // 计算2个时间差
        System.out.println("花了:" + (time2 - time1) + "毫秒");

    }
}
