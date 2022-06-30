package com.itheima.demo3_File类的常用方法;

import java.io.File;

public class Test3_判断功能 {
    public static void main(String[] args) {
        //创建File对象
        File f1 = new File("day10\\aaa");
        File f2 = new File("day10\\aaa\\a.txt");
        File f3 = new File("day10\\aaa\\aa.txt");

        //public boolean exists()：此File表示的文件或目录是否实际存在。
        System.out.println("f1表示的文件夹是否真实存在："+f1.exists());//true
        System.out.println("f2表示的文件是否真实存在："+f2.exists());//true
        System.out.println("----------");

        //public boolean isDirectory()：此File表示的是否为目录。
        System.out.println("f1表示的是否是文件夹："+f1.isDirectory());//true
        System.out.println("f2表示的是否是文件夹："+f2.isDirectory());//false
        System.out.println("----------");

        //public boolean isFile()：此File表示的是否为文件。
        System.out.println("f1表示的是否是文件："+f1.isFile());//false
        System.out.println("f2表示的是否是文件："+f2.isFile());//true
        System.out.println("----------");

        System.out.println("f3表示的文件是否真实存在："+f3.exists());//false
        System.out.println("f3表示的是否是文件夹："+f3.isDirectory());//false
        System.out.println("f3表示的是否是文件："+f3.isFile());//false
    }
}
