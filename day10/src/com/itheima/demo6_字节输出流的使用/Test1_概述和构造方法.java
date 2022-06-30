package com.itheima.demo6_字节输出流的使用;

import java.io.File;
import java.io.FileOutputStream;

public class Test1_概述和构造方法 {
    public static void main(String[] args) throws Exception{
        /*
        介绍
           java.io.OutputStream 抽象类是所有字节输出流的父类，用来写出字节数据的。
           java.io.FileOutputStream 文件输出流，字节输出流常用子类，用于将数据写出到文件。
        构造方法
           public FileOutStream（File file）：创建文件输出流以写入由指定的File对象表示的文件。
           public FileOutputStream（String name）：创建文件输出流以指定的名称写入文件。
           注意:
              1.如果指定的文件路径不存在,就会创建该路径对应的文件
              2.如果指定的文件路径真实存在,就会清空该路径对应文件中的数据
        */
        //创建字节输出流对象，关联目的地文件路径
        FileOutputStream fos1 = new FileOutputStream("day10\\bbb\\a.txt");
        FileOutputStream fos2 = new FileOutputStream(new File("day10\\bbb\\b.txt"));

    }
}
