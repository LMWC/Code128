package com.itheima.demo1_static关键字.demo5_static在开发中的使用;

public class Test {
    public static void main(String[] args) {
        System.out.println(Utils.pi);

        int[] arr = {23,12,4,65,7632,43,76,43};
        int max = Utils.getArrayMax(arr);
        System.out.println("max = " + max);
    }
}

