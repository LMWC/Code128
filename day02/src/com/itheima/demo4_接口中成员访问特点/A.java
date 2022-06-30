package com.itheima.demo4_接口中成员访问特点;

public interface A {
    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void method1();

    // 默认方法
    public default void method2(){
        System.out.println("A接口中默认方法method2...");
    }

    // 静态方法
    public static void method3(){
        System.out.println("A接口中静态方法method3...");
    }

    // 私有方法
    //private void method4(){};
    //private static void method5(){};
}

