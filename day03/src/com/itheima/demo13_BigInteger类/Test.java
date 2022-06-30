package com.itheima.demo13_BigInteger类;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        //int num1 = 10;
        //int num2 = 2212345678;// 编译报错,因为右边的整数已经超过了int所能表示的数据范围
        //long num2 = 2212345678L;// 解决上面一行代码的问题
        //long num3 = 50000000000012345678L;// 编译报错,因为右边的整数已经超过了long所能表示的数据范围
        // 解决上面一行代码的问题----BigInteger类
        /*
            概述:java.math.BigInteger  表示不可变任意精度的整数
            构造方法:
                BigInteger(String value) 将 BigInteger 的十进制字符串表示形式转换为 BigInteger
            成员方法:
                public BigInteger add(BigInteger value)  		加法运算
                public BigInteger subtract(BigInteger value)  		减法运算
                public BigInteger multiply(BigInteger value)  		乘法运算
                public BigInteger divide(BigInteger value)  		除法运算
         */
        // 创建BigInteger对象,表示一个超大的整数
        BigInteger b1 = new BigInteger("50000000000012345678");
        BigInteger b2 = new BigInteger("10000000000000000000");

        // 运算
        BigInteger res1 = b1.add(b2);
        System.out.println("res1 = " + res1);// 60000000000012345678

        BigInteger res2 = b1.subtract(b2);
        System.out.println("res2 = " + res2);// 40000000000012345678

        BigInteger res3 = b1.multiply(b2);
        System.out.println("res3 = " + res3);// 500000000000123456780000000000000000000

        BigInteger res4 = b1.divide(b2);
        System.out.println("res4 = " + res4);// 5

    }
}
