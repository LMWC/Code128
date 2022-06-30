package com.itheima.demo6_转换流的使用;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test2_转换输出流 {
    public static void main(String[] args) throws Exception{
        /*
        概述:
           java.io.OutputStreamWriter转换输出流，是Writer的子类，所以是字符输出流
        作用:
           指定编码写数据，如果没有指定编码，那么使用平台默认编码
           可以将字节输出流转换为字符输出流
        构造方法:
           public OutputStreamWriter(OutputStream in);创建使用默认字符集的字符输出流。
           public OutputStreamWriter(OutputStream in,String charsetName);创建指定字符集的字符输出流。
         */
        // 1.创建转换输出流对象,关联目的地文件路径,指定gbk编码
        //FileOutputStream fos = new FileOutputStream("day11\\ccc\\utf8_1.txt");
        //OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");

        FileOutputStream fos = new FileOutputStream("day11\\ccc\\gbk_1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        // 2.写数据
        osw.write("黑马程序员");

        // 3.关闭流,释放资源
        osw.close();
    }
}
