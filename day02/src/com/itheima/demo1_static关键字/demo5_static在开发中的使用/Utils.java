package com.itheima.demo1_static关键字.demo5_static在开发中的使用;

/*
开发项目中，通常需要一些“全局变量”或“全局方法”。这些全局变量和方法，可以单独定义在一个类中，
并声明为static(静态)的，方便通过类名访问，这样的类被称为工具类。
 */
// 工具类
public class Utils {
    public static double pi = 3.14;// 静态成员变量

    // 静态方法
    public static int getArrayMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

