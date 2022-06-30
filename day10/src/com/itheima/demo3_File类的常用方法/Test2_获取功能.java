package com.itheima.demo3_File类的常用方法;

import java.io.File;

public class Test2_获取功能 {
    public static void main(String[] args) {
        //创建File对象，表示a.txt文件
        File f1 = new File("F:\\Code128\\day10\\aaa\\a.txt");
        File f2 = new File("day10\\aaa\\a.txt");
        File f3 = new File("day10\\aaa");

        //public String getAbsolutePath()：返回此File的绝对路径名字符串。
        System.out.println("f1的绝对路径："+f1.getAbsolutePath());
        System.out.println("f2的绝对路径："+f2.getAbsolutePath());

        //public String getPath()：将此File转换为路径名字符串。   构造路径
        System.out.println("f1的路径："+f1.getPath());
        System.out.println("f2的路径："+f2.getPath());

        //public String getName()：返回由此File表示的文件或目录的名称。
        System.out.println("f2表示的文件的名称："+f2.getName());//a.txt

        //public long length()：返回由此File表示的文件的字节大小，注意不能获取文件夹的字节大小。
        System.out.println("f2表示的文件的字节大小："+f2.length());//6

        //注意不能获取文件夹的字节大小。
        System.out.println("f3表示的文件夹的字节大小："+f3.length());//4096
    }
}
