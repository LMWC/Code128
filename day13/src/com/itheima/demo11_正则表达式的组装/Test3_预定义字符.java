package com.itheima.demo11_正则表达式的组装;

public class Test3_预定义字符 {
    public static void main(String[] args) {
        /*
          语法：
             1. "." ： 匹配任何字符。如果要表示一个字符点,那么就得使用\\.
             2. "\d"：任何数字[0-9]的简写；
             3. "\D"：任何非数字\[^0-9\]的简写；
             4. "\s"： 空白字符：[ \t\n\x0B\f\r] 的简写
             5. "\S"： 非空白字符：[^\s] 的简写
             6. "\w"：单词字符：[a-zA-Z_0-9]的简写
             7. "\W"：非单词字符：\[^\w\]
         */
        // 需求:按照如下要求，使用正则表达式，完成字符串内容的验证。
        // 1.验证str是否是3位数字
        //System.out.println("023".matches("[1-9]\\d\\d"));// false
        System.out.println("123".matches("\\d\\d\\d"));// true
        System.out.println("12a".matches("\\d\\d\\d"));// false
        System.out.println("12".matches("\\d\\d\\d"));// false
        System.out.println("--------");

        // 2.验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        System.out.println("13612345678".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// true
        System.out.println("1361234567a".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("14612345678".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("1561234567".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("25612345678".matches("1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d"));// false
        System.out.println("--------");

        // 3.验证字符串是否以h开头，以d结尾，中间是任何字符
        System.out.println("h.d".matches("h.d"));// true
        System.out.println("h&d".matches("h.d"));// true
        System.out.println("had".matches("h.d"));// true
        System.out.println("hab".matches("h.d"));// false
        System.out.println("aad".matches("h.d"));// false
        System.out.println("--------");


        // 4.验证str是否是：h.d
        System.out.println("h.d".matches("h\\.d"));// true
        System.out.println("h&d".matches("h\\.d"));// false
        System.out.println("had".matches("h\\.d"));// false
        System.out.println("hab".matches("h\\.d"));// false
        System.out.println("aad".matches("h\\.d"));// false
        System.out.println("--------");
    }
}

