package com.itheima.demo5_递归的练习;

public class Test1_计算累加和 {
        public static void main(String[] args) {
            /*
            需求:使用递归计算1 ~ n的累加和
            分析：
               1的累加和 = 1
               2的累加和 = 1 + 2
               3的累加和 = 1 + 2 + 3
               ...
               n的累加和 = 1 + 2 + 3 + ... + n-1 + n
               n的累加和 = n + (n-1)的累加和
            */
            System.out.println(getSum(5));// 15
        }

        /**
         * 递归计算累加和
         * @param n
         * @return sum
         */
        public static int getSum(int n){
            // 出口
            if (n == 1){
                return 1;
            }

            // 递归
            return n + getSum(n - 1);
        }
}
