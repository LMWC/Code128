package com.itheima.demo13_异常的经典面试题;

public class Test {
    public static void main(String[] args) {
        System.out.println("method1() = " + method1());// 20
        System.out.println("method2() = " + method2());// 30
    }

    public static int method1() {
        int num = 10;
        try {
            int res = 1 / 0;// 发生异常
            System.out.println("res = " + res);
        } catch (Exception e) {
            num = 20;
            // catch中的return语句会做2件事: 1.先记录要返回的值,然后执行finally中的代码 2.返回记录的值,然后结束方法
            return num;
        } finally {
            num = 30;
            System.out.println("finally...");
        }

        return num;
    }

    public static int method2() {
        int num = 10;
        try {
            int res = 1 / 0;// 发生异常
            System.out.println("res = " + res);
        } catch (Exception e) {
            num = 20;
            // catch中的return语句会做2件事: 1.先记录要返回的值,然后执行finally中的代码 2.返回记录的值,然后结束方法
            return num;
        } finally {
            num = 30;
            return num;// 直接返回num的值,然后结束方法
        }

    }
}
