package com.itheima.demo15_Arrays类;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
            概述:java.util.Arrays类：该类包含用于操作数组的各种方法（如排序和搜索）。
            常用方法:
            - public static void sort(任意类型的数组)：按照数字顺序排列指定的数组
            - public static String toString(任意类型的数组)：返回指定数组的内容的字符串表示形式
         */
        // 定义一个数组,并初始化
        int[] arr = {23,14,2,45,67,45,32,66,88};
        System.out.println("arr = " + arr);// 地址值
        System.out.println("排序之前: "+Arrays.toString(arr));// 把数组元素转换为指定格式的字符串,打印输出

        // 排序
        Arrays.sort(arr);
        System.out.println("排序之后: "+Arrays.toString(arr));// 把数组元素转换为指定格式的字符串,打印输出
    }
}
