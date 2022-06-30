package com.itheima.demo11_Math类;

public class Test {
    public static void main(String[] args) {
        /*
            概述:java.lang.Math(类): Math包含执行基本数字运算的方法的工具类。
            构造方法:Math类构造方法被私有修饰，不能创建对象。通过类名调用内部静态方法即可。
            常用方法:
                public static int abs(int a)                   获取参数a的绝对值
                public static double ceil(double a)            向上取整
                public static double floor(double a)           向下取整
                public static double pow(double a, double b)   获取a的b次幂
                public static long round(double a)             四舍五入取整
                public static int max(int a, int b)            返回两个 int 值中较大的一个
                public static int min(int a, int b)            返回两个 int 值中较小的一个
         */
        System.out.println("10的绝对值: " + Math.abs(10));// 10
        System.out.println("-10的绝对值: " + Math.abs(-10));// 10
        System.out.println("3.14向上取整:" + Math.ceil(3.14));// 4.0
        System.out.println("-3.14向上取整:" + Math.ceil(-3.14));// -3.0
        System.out.println("3.14向下取整:" + Math.floor(3.14));// 3.0
        System.out.println("-3.14向下取整:" + Math.floor(-3.14));// -4.0
        System.out.println("2的3次方:" + Math.pow(2, 3));// 8.0
        System.out.println("3.14四色五入:" + Math.round(3.14));// 3
        System.out.println("3.54四色五入:" + Math.round(3.54));// 4
        System.out.println("10和20的最大值:" + Math.max(10, 20));// 20
        System.out.println("10和20的最小值:" + Math.min(10, 20));// 10
    }
}
