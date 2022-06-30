package com.itheima.demo1_File类的构造方法;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        /*
        概述
           java.io.File类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找和删除等操作。
        常用构造方法
           public File(String pathname)：通过给定的路径名字符串转换为抽象路径名来创建新的File实例。
           public File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的File实例。
           public File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的File实例。
        注意:
           *创建File对象时,如果传入的文件或者文件夹路径不存在,依然不影响File对象的创建
        */
        //1.创建File对象表示a.txt文件的路径
        File f1 = new File("F:\\Code128\\day10\\aaa\\a.txt");
        System.out.println("f1:"+f1);

        //创建File对象表示aaa文件夹的路径
        File f2 = new File("F:\\Code128\\day10\\aaa");
        System.out.println("f2:"+f2);

        //通过父子路径来创建File对象
        File f3 = new File("F:\\Code128\\day10\\aaa","a.txt");
        System.out.println("f3:"+f3);
        File f4 = new File(f2, "a.txt");
        System.out.println("f4:"+f4);

        //注意:*创建File对象时,如果传入的文件或者文件夹路径不存在,依然不影响File对象的创建
        File f = new File("F:\\Code128\\day10\\aaa\\aa.txt");
        System.out.println("f:"+f);
    }
}
