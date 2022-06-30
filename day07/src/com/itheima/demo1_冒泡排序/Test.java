package com.itheima.demo1_冒泡排序;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {45, 25, 35, 55, 15};

        // 冒泡排序
        // 外层循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制每轮比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 比较交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 打印数组
        System.out.println(Arrays.toString(arr));
    }
}
