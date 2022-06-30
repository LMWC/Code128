package com.itheima.demo10_打印流;

import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws Exception{
        /*
        概述:
           java.io.PrintStream类，该类能够方便地打印各种类型的数据，是一种便捷的输出方式。
           在控制台输出时，System.out就是java.io.PrintStream类型的，只不过流向是由打印在控制台上。
        方法:
           public PrintStream(String fileName);使用指定的文件名创建一个新的打印流。
           public void print(任意类型);打印任意类型的数据到目的地文件中，打印完不换行。
           public void println(任意类型);打印任意类型的数据到目的地文件中,打印完换行。
         */
        // 1.创建打印流对象,关联目的地文件路径
        PrintStream ps1 = new PrintStream("day11\\ddd\\ps.txt");

        // 2.打印各种类型的数据
        ps1.print(true);
        ps1.print(3.14);
        ps1.print('a');
        ps1.print(98);
        ps1.print("itheima");
        ps1.println(true);
        ps1.println(3.14);
        ps1.println('a');
        ps1.println(98);
        ps1.println("itheima");

        //System类中的PrintStream流打印是打印到控制台
        System.out.println("aaa");

        PrintStream ps = System.out;
        ps.println("aaa");
    }
}
