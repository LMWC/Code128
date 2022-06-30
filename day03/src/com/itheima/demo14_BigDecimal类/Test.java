package com.itheima.demo14_BigDecimal类;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        //System.out.println(0.09 + 0.01);// 期望: 0.10    实际结果: 和期望的结果不一致,因为有些小数在内存中保存的并不是小数本身,而是一个无限趋近该小数的数
        //System.out.println(1.0 - 0.32);//  期望: 0.68    实际结果: 和期望的结果不一致,因为有些小数在内存中保存的并不是小数本身,而是一个无限趋近该小数的数
        //System.out.println(1.015 * 100);// 期望: 101.500    实际结果: 和期望的结果不一致,因为有些小数在内存中保存的并不是小数本身,而是一个无限趋近该小数的数
        //System.out.println(1.301 / 100);// 期望: 0.01301    实际结果: 和期望的结果不一致,因为有些小数在内存中保存的并不是小数本身,而是一个无限趋近该小数的数
        //System.out.println(0.2 + 0.3);// 0.5

        // 解决小数运算的精度问题,可以使用BigDecimal类
        /*
            BigDecimal类:
                概述: java.math.BigDecimal类可以用来表示超大的小数,或者用来解决小数运算的精度问题
                构造方法;
                    BigDecimal(String val)  将 BigDecimal 的字符串表示形式转换为 BigDecimal
                    BigDecimal(double val)  将double类型的数据封装为BigDecimal对象,不推荐使用
                成员方法:
                    public BigDecimal add(BigDecimal value)  		加法运算
                    public BigDecimal subtract(BigDecimal value)  		减法运算
                    public BigDecimal multiply(BigDecimal value)  		乘法运算
                    public BigDecimal divide(BigDecimal value)  		除法运算，不推荐
         */
        // 加法运算-----依然无法解决小数运算精度问题
        BigDecimal b11 = new BigDecimal(0.09);
        BigDecimal b12 = new BigDecimal(0.01);
        BigDecimal res = b11.add(b12);
        System.out.println("res = " + res);

        // 加法运算
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal res1 = b1.add(b2);
        System.out.println("res1 = " + res1);// 0.10

        // 减法运算
        BigDecimal b3 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("0.32");
        BigDecimal res2 = b3.subtract(b4);
        System.out.println("res2 = " + res2);// 0.68

        // 乘法运算
        BigDecimal b5 = new BigDecimal("1.015");
        BigDecimal b6 = new BigDecimal("100");
        BigDecimal res3 = b5.multiply(b6);
        System.out.println("res3 = " + res3);// 101.500

        // 除法运算
        BigDecimal b7 = new BigDecimal("1.301");
        BigDecimal b8 = new BigDecimal("100");
        BigDecimal res4 = b7.divide(b8);
        System.out.println("res4 = " + res4);// 0.01301

    }
}
