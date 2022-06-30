package com.itheima.demo14_BigDecimal类;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
        /*
            public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) 除法
                divisor：除数对应的BigDecimal对象；
                scale:精确的位数；
                roundingMode取舍模式  枚举类型，示例： RoundingMode.HALF_UP 四舍五入
         */
        BigDecimal b1 = new BigDecimal("20");
        BigDecimal b2 = new BigDecimal("3");
        //BigDecimal res1 = b1.divide(b2);// 除不尽的时候会报异常ArithmeticException
        BigDecimal res1 = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println("res1 = " + res1);// res1 = 6.67

    }
}
