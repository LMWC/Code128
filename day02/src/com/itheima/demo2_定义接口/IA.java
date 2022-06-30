package com.itheima.demo2_定义接口;

public interface IA {
    // 常量(jdk7及其以前) 默认修饰符: public static final 这三个修饰符可以省略不写
    public static final int num = 10;

    // 抽象方法(jdk7及其以前) 默认修饰符: public abstract 这二个修饰符可以省略不写
    public abstract void method1();

    // 默认方法(jdk8额外增加)--有方法体的方法 修饰符: public default 其中public可以省略,default不可以省略
    public default void method2(){
        System.out.println("IA接口 默认方法method2...");
    }

    // 静态方法(jdk8额外增加) 修饰符: public static  其中public可以省略,static不可以省略
    public static void method3(){
        System.out.println("IA接口 静态方法method3...");
    }

    // 私有方法(jdk9额外增加)
    //private void method4(){}// 私有非静态
    //private static void method4(){}// 私有静态

}

