package com.itheima.demo3_查找算法;

public class Test1_普通查找 {
    public static void main(String[] args) {
        //需求：定义数组存储{10, 14, 21, 38, 45, 47, 53, 81, 87, 99}个数据，使用普通查找找到47的位置
        int[] arr= {10, 14, 21, 38, 45, 47, 53, 81, 87, 99};

            System.out.println(arr[12]);// 产生异常,创建ArrayIndexOutOfBoundsException异常对象


        System.out.println(searchElement(arr, 47));
        System.out.println(searchElement(arr, 50));
    }

    public static int searchElement(int[] arr, int num) {
        //遍历数组，获取每一个元素，
        for (int i = 0; i < arr.length; i++) {
            //判断当前遍历的元素是否和要查找的元素相同，
            if (arr[i] == num) {
                //如果相同就返回该元素的索引，结束循环
                return i;
            }
        }
        //循环结束视为没有找到，就返回一个负数作为标识(一般是1)
        return -1;
    }
}
