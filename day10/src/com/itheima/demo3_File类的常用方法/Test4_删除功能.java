package com.itheima.demo3_File类的常用方法;

import java.io.File;

public class Test4_删除功能 {
    public static void main(String[] args) {
        //创建File对象
        File f1 = new File("day10\\aaa\\bbb");
        File f2 = new File("day10\\aaa\\b.txt");
        File f3 = new File("day10\\aaa\\ccc");

        //public boolean delete()：删除由此File表示的文件或空文件夹，不能删除非空文件夹。
        System.out.println("删除f1表示的空文件夹："+f1.delete());//true
        System.out.println("删除f2表示的文件："+f2.delete());//true
        System.out.println("删除f3表示的非空文件夹："+f3.delete());//false
    }
}
