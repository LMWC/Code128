package com.itheima.demo11_正则表达式的组装;

public class Test4_数量词 {
    public static void main(String[] args) {
         /*
           语法：
              1. X? : 0次或1次
              2. X* : 0次到多次
              3. X+ : 1次或多次
              4. X{n} : 恰好n次
              5. X{n,} : 至少n次
              6. X{n,m}: n到m次(n和m都是包含的)
         */
        // 需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        // 1.验证str是否是三位数字
        System.out.println("123".matches("\\d{3}"));// true
        System.out.println("12a".matches("\\d{3}"));// false
        System.out.println("12".matches("\\d{3}"));// false
        System.out.println("--------");

        // 2.验证str是否是多位数字
        System.out.println("1".matches("\\d+"));// true
        System.out.println("12".matches("\\d+"));// true
        System.out.println("123".matches("\\d+"));// true
        System.out.println("1234".matches("\\d+"));// true
        System.out.println("12a".matches("\\d+"));// false
        System.out.println("--------");

        // 3.验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        System.out.println("13612345678".matches("1[358]\\d{9}"));// true
        System.out.println("1361234567a".matches("1[358]\\d{9}"));// false
        System.out.println("14612345678".matches("1[358]\\d{9}"));// false
        System.out.println("15612345678".matches("1[358]\\d{9}"));// false
        System.out.println("25612345678".matches("1[358]\\d{9}"));// false
        System.out.println("--------");

        // 4.验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0

        System.out.println("12345678".matches("[1-9]\\d{4,14}"));// true
        System.out.println("02345678".matches("[1-9]\\d{4,14}"));// false
        System.out.println("1234567a".matches("[1-9]\\d{4,14}"));// false
        System.out.println("123".matches("[1-9]\\d{4,14}"));// false
    }
}

