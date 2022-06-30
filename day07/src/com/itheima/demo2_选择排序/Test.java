package com.itheima.demo2_选择排序;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {45, 25, 35, 55, 15};

        // 选择排序
        // 外层循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制每轮比较的次数
            for (int j = i+1;j<arr.length;j++){
                // 比较交换
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 打印数组
        System.out.println(Arrays.toString(arr));
    }
}
