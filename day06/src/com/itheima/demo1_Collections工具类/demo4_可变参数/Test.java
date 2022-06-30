package com.itheima.demo1_Collections工具类.demo4_可变参数;

public class Test {
    public static void main(String[] args) {
        /*
            概述:在JDK1.5之后，定义了可变参数，用来表示一个方法需要接受的多个同类型参数。
            格式:参数类型... 形参名
         */
        // 调用method1方法,传入多个int值
        method1(10,20,30,40);
        // 调用method2方法,传入int数组
        int[] arr = {10,20,30,40,50};
        method2(arr);
        System.out.println("-------------------------");
        // 调用method方法,传入多个int值,或者传入int数组
        method();
        System.out.println("-------------------------");
        method(10);
        System.out.println("-------------------------");
        method(10,20);
        System.out.println("-------------------------");
        method(10,20,30);
        System.out.println("-------------------------");
        method(arr);

    }

    // 定义一个方法需要接受的多个int类型参数。
    public static void method(int... nums){
        // 方法中,可变参数就当成数组来使用
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[i] = " + nums[i]);
        }
    }
    public static void method1(int num1,int num2,int num3,int num4){}// 只能接收4个int值,不能多也不能少
    public static void method2(int[] arr){}// 把要传进来的int值,放在一个数组中,传进来----必须传数组
}
