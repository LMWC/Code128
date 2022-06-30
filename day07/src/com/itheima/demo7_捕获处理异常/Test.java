package com.itheima.demo7_捕获处理异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
            作用：处理异常的一种方式，在方法内，使用try包裹可能存在异常问题的代码，用catch负责捕获指定类型的异常，避免异常由jvm处理而引起程序停止
            捕获异常格式:
                try{
                    可能会出现异常的代码
                } catch(异常类型 变量名){
                    打印异常信息\出现异常之后要执行的代码...
                }

            执行流程:
                1.执行try后面大括号中的代码
                2.如果try后面大括号中的代码发生了异常,就会执行catch里面的代码,执行完catch代码之后,程序继续往下执行
                3.如果try后面大括号中的代码没有发生异常,就不会执行catch里面的代码,而是继续执行try\catch结构后面的代码
            特点:
                1.无论try后面大括号中的代码是否发生异常,程序执行完try\catch结构之后,都可以继续往下执行
                2.如果try后面大括号中的代码发生了异常,那么try中发送异常位置之后的代码就不会执行了
         */
        // 案例1:
        try{
            int res = 1 / 0;

            //int res = 1 / 1;
            System.out.println("res = " + res);
        }catch (ArithmeticException e){
            System.out.println("发生了运算异常");
        }
        System.out.println("try\\catch结构之后的代码执行了1...");

        System.out.println("---------------------");

        // 案例2:
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           /* Date date = sdf.parse("1999-10-11");// 可以使用声明处理异常,也可以使用捕获处理
            System.out.println("date = " + date);// date = Mon Oct 11 00:00:00 CST 1999*/

            Date date = sdf.parse("1999年10月11日");// 不可以使用声明处理异常,只能捕获处理异常
            System.out.println("date = " + date);

        } catch (ParseException e) {
            System.out.println("发生了解析异常...");
        }
        System.out.println("try\\catch结构之后的代码执行了2...");
    }
}
