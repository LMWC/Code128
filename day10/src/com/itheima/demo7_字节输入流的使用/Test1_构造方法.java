package com.itheima.demo7_字节输入流的使用;

import java.io.File;
import java.io.FileInputStream;

public class Test1_构造方法 {
    public static void main(String[] args) throws Exception{
        /*
        构造方法
          FileInputStream(File file); 创建文件输入流以读取,由指定的File对象表示要连接的文件。
          FileInputStream(String name); 创建文件输入流以读取,由指定的文件路径名表示要连接的文件。
          注意：创建一个流对象时，必须传入文件路径，且该路径下，如果没有该文件，会抛出文件不存在异常。
         */
        //创建字节输入流对象，关联ccc\a.txt文件
        FileInputStream fis1 = new FileInputStream(new File("day10\\ccc\\a.txt"));// 文件存在
        FileInputStream fis2 = new FileInputStream("day10\\ccc\\a.txt");// 文件存在

        //注意：指定的路径下没有该文件，会报文件找不到异常FileNotFoundException
        //FileInputStream fis3 = new FileInputStream("day10\\ccc\\aa.txt");// 文件存在,报文件找不到异常
    }
}
