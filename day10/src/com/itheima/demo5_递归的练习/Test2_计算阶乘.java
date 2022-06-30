package com.itheima.demo5_递归的练习;

public class Test2_计算阶乘 {
    public static void main(String[] args) {
        /*
        需求:使用递归计算n的阶乘
            分析：
               1的阶乘 = 1
               2的阶乘 = 1 * 2
               3的阶乘 = 1 * 2 * 3
               ...
               n的阶乘 = 1 * 2 * 3 + ... * n-1 * n
               n的阶乘 = n * (n-1)的阶乘
        */
        System.out.println(jieCheng(5));// 120
    }

    /**
     * 计算一个数的阶乘
     * @param n
     * @return 阶乘
     */
    public static int jieCheng(int n){
        // 出口
        if (n == 1){
            return 1;
        }

        // 递归
        return n * jieCheng(n-1);
    }
}
