package com.itheima.demo1_Collections工具类.demo4_可变参数;

public class Test2 {
    public static void main(String[] args) {
        /*
            注意事项:
                可变参数需要定义在方法的形参位置
                一个方法只能有一个可变参数
                如果方法中有多个参数，可变参数要放到最后。
         */
        method2("java",10,20,30);

    }

    // 一个方法只能有一个可变参数
    //public static void method1(int... nums,String... strs){}

    // 如果方法中有多个参数，可变参数要放到最后。
    //public static void method2(int... nums,String str){}
    public static void method2(String str,int... nums){}
}
