package com.itheima.demo3_查找算法;

public class Test2_二分查找 {
    public static void main(String[] args) {
        //需求：定义数组存储{10, 14, 21, 38, 45, 47, 53, 81, 87, 99}个数据，使用普通查找找到47的位置
        int[] arr = {10, 14, 21, 38, 45, 47, 53, 81, 87, 99};
        System.out.println(searchElement(arr, 10));// 0
        System.out.println(searchElement(arr, 47));// 5
        System.out.println(searchElement(arr, 50));// -1

    }

    public static int searchElement(int[] arr, int num) {
        //1.定义一个left变量,用来记录搜索集最左边元素的索引,初始值为0
        int left = 0;

        //2.定义一个right变量,用来记录搜索集最右边元素的所有,初始值为数组长度-1
        int right = arr.length - 1;

        //3.由于查找次数不确定,所以使用while循环查找,循环条件: left <= right
        while (left <= right) {
            //4.在循环里面,计算中间索引:  (right + left) / 2
            int middle = (left + right) / 2;

            //5.在循环里面,判断中间索引对应的元素和要查找的元素
            if (arr[middle] == num) {
                //6.如果中间索引对应的元素等于要查找的元素,就直接返回该中间索引
                return middle;
            } else if (arr[middle] < num) {
                //6.如果中间索引对应的元素小于要查找的元素,说明要查找的元素在右侧,忽略左侧数据(left = middle + 1);
                left = middle + 1;
            } else {
                //6.如果中间索引对应的元素大于要查找的元素,说明要查找的元素在左侧,忽略右侧数据(right = middle - 1);
                right = middle - 1;
            }
        }
        //7.循环结束视为没有找到，就返回一个负数作为标识(一般是-1)
        return -1;

    }
}
